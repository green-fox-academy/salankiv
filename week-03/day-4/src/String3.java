public class String3 {
	public static void main(String[] args) {
		System.out.println(changeXChars ("abcdxxxefghxxx"));
	}

	private static String changeXChars(String string) {
		if (string.length() == 0) {
			return "";
		} else {
			return changeXChars(string.substring(0, string.length() - 1)) + string.substring(string.length() - 1, string.length()) + "*";
		}
	}
}

// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".