import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class ArgumentHandler implements Function{

	public static void checkArguments(String[] args) {

		OptionParser parser = new OptionParser();
		parser.accepts("l");
		parser.accepts("a");
		parser.accepts("r");
		parser.accepts("c");
		OptionSet options = parser.parse(args);

		if (options.has("l")) {

		}
		if (options.has("a")) {

		}
		if (options.has("r")) {

		}
		if (options.has("c")) {

		}
	}

	@Override
	public void greeting() {

	}

	@Override
	public void listTasks() {

	}

	@Override
	public void addTask() {

	}

	@Override
	public void removeTask() {

	}

	@Override
	public void completeTask() {

	}
}
