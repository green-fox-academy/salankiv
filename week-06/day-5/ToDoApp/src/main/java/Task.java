import java.time.LocalDate;
import java.time.LocalDateTime;

public class Task {
	private static int taskCounter;

	public String name;
	public int id;
	public LocalDateTime createdDate;
	public LocalDateTime completedDate;

	public Task(String name) {
		this.name = name;
		taskCounter++;
		this.id = taskCounter;
		this.createdDate = LocalDateTime.now();
		this.completedDate = null;
	}

	public void setCompleted() {
		this.completedDate = LocalDateTime.now();
	}

	public int completionTime() {
		return LocalDate.now().getDayOfYear() - this.completedDate.getDayOfYear();
	}
}
