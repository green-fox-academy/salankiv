import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
	public static void main(String[] args) {
		// Write a function that copies a file to an other
		// It should take the filenames as parameters
		// It should return a boolean that shows if the copy was successful


		System.out.println(copyFile("my-file.txt", "myNewFile.txt"));

	}

	private static boolean copyFile(String file1, String file2) {
		Path firstFile = Paths.get(file1);
		Path secondFile = Paths.get(file2);
		try {
			List<String> content = Files.readAllLines(firstFile);
			Files.write(secondFile, content);
			return true;
		} catch (IOException e) {
			return false;
		}
	}
}
