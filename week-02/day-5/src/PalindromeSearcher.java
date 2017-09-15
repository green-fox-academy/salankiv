import java.util.ArrayList;

public class PalindromeSearcher {
    public static void main(String[] args) {

        String word = "dog goat dad duck doodle never";

        System.out.println(paindrome(word));
    }

    private static ArrayList<String> paindrome(String input) {


        // building charBlocks

        ArrayList<String> stringList = new ArrayList<String>();
        int block = 3;
        String charBlock = "";

        while (block <= input.length() / 2) {
            for (int i = 0; i <= input.length() - block; i++) {
                for (int j = 0; j < block ; j++) {
                    charBlock = charBlock + input.charAt(i + j);
                }
                stringList.add(charBlock);
                charBlock = "";
            }
            block = block + 1;
        }

        // check stringList

        ArrayList<String> palindromeList = new ArrayList<String>();

        for (int i = 0; i < stringList.size(); i++) {
            String toCheck = stringList.get(i);
            boolean palindromeYes = false;
            for (int j = 0; j <= toCheck.length() / 2; j++) {
                if (toCheck.charAt(j) == toCheck.charAt(toCheck.length()- 1 -j)) {
                    palindromeYes = true;
                } else {
                    palindromeYes = false;
                    j = toCheck.length();
                }
            }
            if (palindromeYes) {
                palindromeList.add(stringList.get(i));
            }
        }
        return palindromeList;
    }
}
