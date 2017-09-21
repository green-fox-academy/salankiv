public class String2 {
	public static void main(String[] args) {
		System.out.println(changeXChars ("abcdxxxefghxxx"));
	}

	private static String changeXChars(String string) {
		if (string.length() == 0) {
			return "";
		} else if (string.charAt(string.length() - 1) == 'x') {
			return changeXChars(string.substring(0, string.length() - 1)) + "";
		} else {
			return changeXChars(string.substring(0, string.length() - 1)) + string.substring(string.length() - 1, string.length());
		}
	}
}

// Given a string, compute recursively a new string where all the 'x' chars have been removed.