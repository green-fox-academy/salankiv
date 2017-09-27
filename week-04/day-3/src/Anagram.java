import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Anagram {
	String string1;
	String string2;
	ArrayList<Character> charList = new ArrayList<>();
	String orderdString1;
	String orderedString2;

	public boolean checkAnagram(String string1, String string2) {
		charList.clear();
		System.out.println(splitToChar(string1));
		orderdString1 = splitToChar(string1);
		charList.clear();
		orderedString2 = splitToChar(string2);
		return orderdString1 == orderedString2;
	}

	public String splitToChar(String string) {
		if (string.length() == 1) {
			return string.substring(0,1);
		} else {
				charList.add(string.charAt(string.length()-1));
				Collections.sort(charList);
				return splitToChar(string.substring(0, string.length()-1)).toString();
		}
	}

	public static void main(String[] args) {
		Anagram myAnagram = new Anagram();
		System.out.println(myAnagram.checkAnagram("dog", "god"));
	}

}
