import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FileManupilation {

	public static List<String[]> readFile() {
		List<String[]> lines = null;
		try {
			CSVReader reader = new CSVReader(new FileReader("../../src/asset/tasklist.csv"));
			lines = reader.readAll();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}

	public static void save(Task task) {
		try {
			CSVWriter writer = new CSVWriter(new FileWriter("../../src/asset/tasklist.csv", true));
			writer.writeNext(task.getTaskDetails());
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void saveAll(List<Task> taskList) {
		try {
			CSVWriter writer = new CSVWriter(new FileWriter("../../src/asset/tasklist.csv"));
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (Task t : taskList) {
			save(t);
		}
	}

	public static Task load(String taskId) {
		Task task = null;
		for (String[] s : readFile()) {
			if (s[1].equals(taskId)) {
				String name = s[0];
				int id = Integer.valueOf(s[1]);
				LocalDateTime createdDate = LocalDateTime.parse(s[2]);
				LocalDateTime completedDate = LocalDateTime.parse(s[3]);
				task = new Task(name, id, createdDate, completedDate);
			}
		}
		return task;
	}

	public static List<Task> loadAll() {
		List<Task> taskList = new ArrayList<>();
		List<String[]> lines = FileManupilation.readFile();
		if (lines.size() > 0) {
			for (int i = 0; i < lines.size(); i++) {
				String name = lines.get(i)[0];
				int id = Integer.valueOf(lines.get(i)[1]);
				LocalDateTime createdDate = LocalDateTime.parse(lines.get(i)[2]);
				LocalDateTime completedDate = LocalDateTime.parse(lines.get(i)[3]);
				Task task = new Task(name, id, createdDate, completedDate);
				taskList.add(task);
			}
		}
		return taskList;
	}

	public static void writeTaskCounter() {
		String counterStatus = String.valueOf(Task.getTaskCounter());
		try {
			FileWriter counterWriter = new FileWriter("../../src/asset/taskcounter.txt");
			counterWriter.write(counterStatus);
			counterWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int loadTaskCounter() {
		int counterStatus = 0;
		try {
			Path counterPath = Paths.get("../../src/asset/taskcounter.txt");
			counterStatus = Integer.valueOf(Files.readAllLines(counterPath).get(0));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return counterStatus;
	}
}
