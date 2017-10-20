public class Main {

	public static void main(String[] args) {

		ArgumentHandler.checkArguments(args);

		Task newTask = new Task("whatever task");
		Task newTask2 = new Task("whatever task 2");

		System.out.println(newTask.id);
		System.out.println(newTask2.id);

		newTask.setCompleted();
		System.out.println(newTask.createdDate);
		System.out.println(newTask.completedDate);
		System.out.println(newTask.completionTime());


	}
}
