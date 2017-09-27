import java.util.HashMap;
import java.util.Map;

public class CountLetters {
	String string;
	Map<Character, Integer> dictionary;

	public CountLetters() {
	}

	public Map<Character, Integer> getDictionary(String string) {
		dictionary = new HashMap<Character, Integer>(Math.min(string.length(), 2));
		for (int i = 0; i < string.length(); i++) {
			char charAt = string.charAt(i);
			if (!dictionary.containsKey(charAt)) {
				dictionary.put(charAt, 1);
			} else {
				dictionary.put(charAt, dictionary.get(charAt) + 1);
			}
		}
		return dictionary;
	}

	public static void main(String[] args) {
		CountLetters newDict = new CountLetters();
		System.out.println((newDict.getDictionary("alma").get('b')));

	}
}
