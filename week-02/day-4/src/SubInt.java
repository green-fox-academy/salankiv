import java.util.ArrayList;
import java.util.Arrays;

public class SubInt {
    public static void main(String[] args) {
        //Create a function that takes a number and a list of numbers as a parameter
        //Returns the indexes of the numbers in the list where the first number is part of
        //Returns an empty list if the number is not part any of the numbers in the list

        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1, 11, 34, 52, 61));
        int number = 9;

        System.out.println(numberInList(numberList, number));
    }

    public static ArrayList<Integer> numberInList(ArrayList<Integer> numberList, int number) {
        ArrayList<Integer> listOfIndexes = new ArrayList<>();
        for (int i = 0; i < numberList.size(); i++) {
            if (numberList.get(i).toString().contains(String.valueOf(number))) {
                listOfIndexes.add(i);
            }
        }
        return listOfIndexes;
    }
}
