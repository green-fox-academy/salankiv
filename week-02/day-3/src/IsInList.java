import java.util.*;

public class IsInList{
    public static void main(String... args){
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

        // Check if list contains all of the following elements: 4,8,12,16
        // Print "true" if it contains all, otherwise print "false"
        // Can you do both the different approaches you tried in the previous one?

        boolean contains = list.contains(4) && list.contains(8) && list.contains(12) && list.contains(16);
        if (contains) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // OR

        boolean yes4 = true;
        boolean yes8 = true;

        for (int i = 0; i <= list.size() - 1; i++) {
            if (list.get(i) == 4) {
               yes4 = true;
            }
        }

        for (int i = 0; i <= list.size() - 1; i++) {
            if (list.get(i) == 8) {
                yes8 = true;
            }
        }
        if (yes4 && yes8) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}