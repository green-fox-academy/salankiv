import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Task> taskList = new ArrayList<>();
		taskList = FileManupilation.loadAll();
		ArgumentHandler.checkArguments(args);

		for (Task t : taskList) {
			System.out.println(t.name);
		}

	}
}
