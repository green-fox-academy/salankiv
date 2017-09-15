import java.util.ArrayList;

public class PalindromeBuilder {
    public static void main(String[] args) {

        String word = "greenfox";

        System.out.println(palindrome(word));
    }

    private static String palindrome(String input) {

        String newPalindrome = "";
        int length = input.length();

        if (length == 0) {
            return newPalindrome;
        } else {

            ArrayList<Character> charList = new ArrayList<Character>();

            for (int i = 0; i < length; i++) {
                charList.add(input.charAt(i));
            }

            for (int i = length -1; i >= 0; i--) {
                charList.add(input.charAt(i));
            }

            for (int i = 0; i < charList.size(); i++) {
                newPalindrome = newPalindrome + charList.get(i);
            }

            return newPalindrome;
        }
    }
}
