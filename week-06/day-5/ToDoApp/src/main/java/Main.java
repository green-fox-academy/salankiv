import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Task> taskList;
		taskList = FileManupilation.loadAll();
		ArgumentHandler.checkArguments(args, taskList);

//		for (Task t : taskList) {
//			System.out.println(t.name);
//		}

	}
}
