import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Task> taskList = FileManupilation.loadAll();
		ArgumentHandler.checkArguments(args, taskList);
	}
}
