import java.time.LocalDate;

public class Task {
	private static int taskCounter;

	public String name;
	public boolean completed;
	public int id;
	public LocalDate createdDate;
	public LocalDate completedDate;

	public Task(String name) {
		this.name = name;
		this.completed = false;
		taskCounter++;
		this.id = taskCounter;
		this.createdDate = LocalDate.now();
		this.completedDate = null;
	}

	public void setCompleted() {
		this.completed = true;
		this.completedDate = LocalDate.now();
	}

	public int completionTime() {
		return LocalDate.now().getDayOfYear() - this.completedDate.getDayOfYear();
	}
}
