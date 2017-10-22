import joptsimple.OptionParser;
import joptsimple.OptionSet;

import java.util.ArrayList;
import java.util.List;

public class ArgumentHandler {

	public static void checkArguments(String[] args, List<Task> taskList) {

		OptionParser parser = new OptionParser();
		parser.accepts("l");
		parser.accepts("a").withRequiredArg();
		parser.accepts("r").withRequiredArg();
		parser.accepts("c").withRequiredArg();
		parser.accepts("u").withRequiredArg().withValuesSeparatedBy(',');
		OptionSet options = parser.parse(args);

		if (!options.hasOptions()) {
			greeting();
		}
		if (options.has("l")) {
			listTasks(taskList);
		}
		if (options.has("a")) {
			addTask((String) options.valueOf("a"), taskList);
		}
		if (options.has("r")) {
			removeTask((String) options.valueOf("r"), taskList);
		}
		if (options.has("c")) {
			completeTask((String) options.valueOf("c"), taskList);
		}
		if (options.has("u")) {
			updateTask((List<?>) options.valuesOf("u"), taskList);
		}
	}

	public static void greeting() {
		System.out.println
				("\n" +
						"Command Line Todo application\n" +
						"=============================\n" +
						"\n" +
						"Command line arguments:\n" +
						"-l   Lists all the tasks\n" +
						"-a   Adds a new task\n" +
						"-r   Removes a task\n" +
						"-c   Completes a task\n" +
						"-u   Updates a task\n");
	}

	public static void listTasks(List<Task> taskList) {
		for (Task t : taskList) {
			System.out.println(t.getName());
		}
	}

	public static void addTask(String taskName, List<Task> taskList) {
		Task newTask = new Task(taskName);
		taskList.add(newTask);
		FileManupilation.save(newTask);
	}

	public static void removeTask(String taskName, List<Task> taskList) {
		List<Task> newLines = new ArrayList<>();
		for (Task t : taskList) {
			if (!t.getName().equals(taskName)) {
				newLines.add(t);
			}
		}
		FileManupilation.saveAll(newLines);
	}

	public static void completeTask(String id, List<Task> taskList) {
		Task task = FileManupilation.load(id);
		task.setCompleted();
		removeTask(task.getName(), taskList);
		FileManupilation.save(task);
	}

	public static void updateTask(List<?> args, List<Task> taskList) {
		List<Task> newTaskList = new ArrayList<>();
		for (int i = 0; i < taskList.size(); i++) {
			if (!String.valueOf(taskList.get(i).getId()).equals(args.get(0))) {
				newTaskList.add(taskList.get(i));
			} else {
				taskList.get(i).setName(args.get(1).toString());
				newTaskList.add(taskList.get(i));
			}
		}
		FileManupilation.saveAll(newTaskList);
	}
}
