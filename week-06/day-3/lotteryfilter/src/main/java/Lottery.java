import joptsimple.OptionParser;
import joptsimple.OptionSet;
import com.opencsv.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lottery {

	public static void main(String[] args) {


		OptionParser parser = new OptionParser();
		parser.accepts("y").withRequiredArg();
		parser.accepts("f").withRequiredArg();
		parser.accepts("o").withRequiredArg();
		OptionSet options = parser.parse(args);

		if (options.has("y")) {
			System.out.println("Nice try");
			try {
				List<String[]> lines = null;
				CSVReader reader = new CSVReader(new FileReader("../../src/asset/otos.csv"));
				CSVWriter writer = new CSVWriter(new FileWriter("../../src/asset/result.csv"));
				lines = reader.readAll();
				List<String[]> copyLines = new ArrayList<>();


				
				writer.writeAll(copyLines);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
