import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
	public static void main(String[] args) {
		// Write a function that takes a filename as string,
		// then returns the number of lines the file contains.
		// It should return zero if it can't open the file, and
		// should not raise any error.

		System.out.println(numberOfLines("src/encoded-lines.txt"));

	}

	private static int numberOfLines(String fileName) {
		try {
			Path myPath = Paths.get(fileName);
			List<String> lines = Files.readAllLines(myPath);
			int linesNumber = lines.size();
			return linesNumber;
		} catch (IOException e) {
			return 0;
		}
	}
}
