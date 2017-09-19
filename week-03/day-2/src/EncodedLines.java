import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {
  public static void main(String[] args) {
    // Create a method that decrypts encoded-lines.txt
    for (String lines : decrypter("src/encoded-lines.txt")) {
        System.out.println(lines);
    }
  }

  public static List<String> decrypter (String fileName) {
    Path filePath = Paths.get(fileName);
    String singledLine = "";
    List<String> singledText = new ArrayList<>();
    try {
      List<String> content = Files.readAllLines(filePath);
      for (int i = 0; i < content.size(); i++) {
        String line = content.get(i);
        List<Character> characters = new ArrayList<>();
        for (int j = 0; j < line.length(); j ++) {
          if (line.charAt(j) == ' ') {
              characters.add(' ');
          } else {
              char c = (char) (Integer.valueOf(line.charAt(j)) - 1);
              characters.add(c);
          }
        }
        for (int k = 0; k < characters.size(); k++) {
        singledLine = singledLine + characters.get(k);
        }
        singledText.add(singledLine);
        singledLine = "";
      }
      return singledText;
    }
    catch (IOException e) {
      System.out.println("Could not find file");
    }
    return null;
  }
}
