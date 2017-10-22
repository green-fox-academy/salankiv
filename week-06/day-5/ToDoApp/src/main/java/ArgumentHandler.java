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
			listTasks();
		}
		if (options.has("a")) {
			addTask((String) options.valueOf("a"), taskList);
		}
		if (options.has("r")) {
			removeTask((String) options.valueOf("r"));
		}
		if (options.has("c")) {
			completeTask((String) options.valueOf("c"));
		}
		if (options.has("u")) {
			updateTask((List<?>) options.valuesOf("u"));
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

	public static void listTasks() {
		List<String[]> lines = FileManupilation.readFile();
		for (String[] s : lines) {
			System.out.println(s[0]);
		}
	}

	public static void addTask(String taskName, List<Task> taskList) {
		Task newTask = new Task(taskName);
		taskList.add(newTask);
		FileManupilation.save(newTask);
	}

	public static void removeTask(String taskName) {
		List<String[]> lines = FileManupilation.readFile();
		List<String[]> newLines = new ArrayList<>();
		for (String[] l : lines) {
			if (!l[0].equals(taskName)) {
				newLines.add(l);
			}
		}
		FileManupilation.saveAll(newLines);
	}

	public static void completeTask(String id) {
		Task task = FileManupilation.load(id);
		task.setCompleted();
		removeTask(task.name);
		FileManupilation.save(task);
	}

	public static void updateTask(List<?> args) {
		List<String[]> lines = FileManupilation.readFile();
		List<String[]> newLines = new ArrayList<>();
		for (int i = 0; i < lines.size(); i++) {
			if (!lines.get(i)[1].equals(args.get(0))) {
				newLines.add(lines.get(i));
			} else {
				lines.get(i)[0] = args.get(1).toString();
				newLines.add(lines.get(i));
			}
		}
		FileManupilation.saveAll(newLines);
	}
}
