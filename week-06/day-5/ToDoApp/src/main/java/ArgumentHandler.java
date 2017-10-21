import joptsimple.OptionParser;
import joptsimple.OptionSet;

import java.util.List;

public class ArgumentHandler {

	public static void checkArguments(String[] args, List<Task> taskList) {

			OptionParser parser = new OptionParser();
			parser.accepts("l");
			parser.accepts("a").withRequiredArg();
			parser.accepts("r").withRequiredArg();
			parser.accepts("c");
			parser.accepts("u");
			OptionSet options = parser.parse(args);

			if (!options.hasOptions()) {
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
			if (options.has("l")) {
				System.out.println("list");
			}
			if (options.has("a")) {
				addTask((String) options.valueOf("a"), taskList);
			}
			if (options.has("r")) {
				removeTask((String) options.valueOf("r"));
			}
			if (options.has("c")) {

			}
			if (options.has("u")) {

			}
		}

	public void greeting() {

	}

	public void listTasks() {

	}

	public static void addTask(String taskName, List<Task> taskList) {
		Task newTask = new Task(taskName);
		taskList.add(newTask);
	}

	public static void removeTask(String taskName) {
	}

	public void completeTask() {

	}
}
