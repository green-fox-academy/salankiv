import java.util.*;

public class QuoteSwap{
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code

        // Also, print the sentence to the output with spaces in between.

        ArrayList<String> correctList = new ArrayList<String>(Arrays.asList("What", "I", "cannot", "create,", "I", "do", "not", "understand."));

        for (int i = 0; i <= correctList.size() - 1 ; i++) {
            if (correctList.get(i).equals(list.get(i))) {
            } else {
                list.set(i, correctList.get(i));
            }
        }

        for (int i = 0; i <= list.size() - 1; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}