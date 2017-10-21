import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class ArgumentHandler {

	public static void checkArguments(String[] args) {

		OptionParser parser = new OptionParser();
		parser.accepts("l");
		parser.accepts("a").withRequiredArg();
		parser.accepts("r").withRequiredArg();
		parser.accepts("c");
		parser.accepts("u");
		OptionSet options = parser.parse(args);

		if (options.has("l")) {

		}
		if (options.has("a")) {
			addTask((String) options.valueOf("a"));
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

	public static void addTask(String taskName) {
		Task newTask = new Task(taskName);
	}

	public static void removeTask(String taskName) {
	}

	public void completeTask() {

	}
}
