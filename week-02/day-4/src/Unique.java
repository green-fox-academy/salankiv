import java.util.ArrayList;
import java.util.Collections;

public class Unique {
    public static void main(String[] args) {
        // Create a function that takes a list of numbers as a parameter
        //Returns a list of numbers where every number in the list occurs only once

        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(11);
        numberList.add(34);
        numberList.add(11);
        numberList.add(52);
        numberList.add(61);
        numberList.add(1);
        numberList.add(1);
        numberList.add(34);
        numberList.add(34);
        numberList.add(61);

        Collections.sort(numberList);
        System.out.println(numberList);

        ArrayList<Integer> sortedList = new ArrayList<>();

        for (int i = 0; i < numberList.size(); i++) {
            if (sortedList.contains(numberList.get(i))) {
            } else if (i != numberList.size() - 1 && numberList.get(i) == numberList.get(i + 1)) {
                sortedList.add(numberList.get(i));
                } else {
                    sortedList.add(numberList.get(i));
                }
        }
        System.out.println(sortedList);
    }
}
