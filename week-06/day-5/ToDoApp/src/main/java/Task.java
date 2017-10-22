import java.time.LocalDate;
import java.time.LocalDateTime;

public class Task {
	private static int taskCounter = FileManupilation.loadTaskCounter();

	private String name;
	private int id;
	private LocalDateTime createdDate;
	private LocalDateTime completedDate;

	public Task(String name) {
		this.name = name;
		taskCounter++;
		FileManupilation.writeTaskCounter();
		id = taskCounter;
		createdDate = LocalDateTime.now();
		completedDate = createdDate;
	}

	public Task(String name, int id, LocalDateTime createdDate, LocalDateTime completedDate) {
		this.name = name;
		this.id = id;
		this.createdDate = createdDate;
		this.completedDate = completedDate;
	}

	public void setCompleted() {
		completedDate = LocalDateTime.now();
	}

	public void setName(String newName) {
		name = newName;
	}

	public int completionTime() {
		return LocalDate.now().getDayOfYear() - completedDate.getDayOfYear();
	}

	public String[] getTaskDetails() {
		String[] taskDetails = new String[4];
		taskDetails[0] = this.getName();
		taskDetails[1] = String.valueOf(this.getId());
		taskDetails[2] = String.valueOf(this.getCreatedDate());
		taskDetails[3] = String.valueOf(this.getCompletedDate());
		return taskDetails;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public LocalDateTime getCompletedDate() {
		return completedDate;
	}

	public static int getTaskCounter() {
		return taskCounter;
	}
}
