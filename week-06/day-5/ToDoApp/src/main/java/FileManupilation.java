import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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

	public static void writeFile(String[] lines) {
		try {
			CSVWriter writer = new CSVWriter(new FileWriter("../../src/asset/tasklist.csv"));
			writer.writeNext(lines);
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void save(Task task) {

	}

	public static void savaAll(List<Task> taskList) {

	}

	public static void load(int taskId) {

	}

	public static void load(String taskName) {

	}

	public static List<Task> loadAll() {
		List<Task> taskList = new ArrayList<>();
		List<String[]> lines = new ArrayList<>();
		lines =	FileManupilation.readFile();
		for (int i = 0; i < lines.size(); i++) {
			String name = lines.get(i)[0];
			int id = Integer.valueOf(lines.get(i)[1]);
			LocalDateTime createdDate = LocalDateTime.parse(lines.get(i)[2]);
			LocalDateTime completedDate = LocalDateTime.parse(lines.get(i)[3]);
			Task task = new Task(name, id, createdDate, completedDate);
			taskList.add(task);
		}
		return taskList;
	}

}
