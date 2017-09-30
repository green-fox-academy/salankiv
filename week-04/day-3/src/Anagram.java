public class Anagram {
	String string1;
	String string2;

	public boolean checkAnagram(String string1, String string2) {
		return sort(string1).equals(sort(string2));
	}

	private String sort(String string) {
		StringBuilder sb = new StringBuilder(string);
		for (int i = 0; i < sb.length(); i++) {
			for (int j = 0; j < sb.length(); j++) {
				if (sb.charAt(j) < sb.charAt(i)) {
					sb.insert(i, sb.charAt(j));
					sb.deleteCharAt(j + 1);
				}
			}
		}
		return sb.toString();
	}


	public static void main(String[] args) {
		Anagram myAnagram = new Anagram();
		System.out.println(myAnagram.checkAnagram("alma", "mlaa"));
	}

}
