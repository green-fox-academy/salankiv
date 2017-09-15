import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String firstWord = "dog";
        String secondWord = "god";

        System.out.println(anagram(firstWord, secondWord));
    }

    private static boolean anagram(String input1, String input2) {
        char[] charArray1 = input1.toCharArray();
        char[] charArray2 = input2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        String sorted1 = new String(charArray1);
        String sorted2 = new String(charArray2);

        boolean equal = sorted1.matches(sorted2);
        return equal;
    }
}
