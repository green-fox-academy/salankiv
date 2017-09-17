import java.util.ArrayList;

public class Bubble {
    public static void main(String[] args) {
        //Create a function that takes a list of numbers as parameter
        //Returns a list where the elements are sorted in ascending numerical order
        //Make a second boolean parameter, if it's true sort that list descending

        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(34);
        numberList.add(12);
        numberList.add(24);
        numberList.add(9);
        numberList.add(5);

        System.out.println(numberList);

        System.out.println(bubble(numberList));
    }

    public static ArrayList bubble(ArrayList<Integer> inputList) {
        for (int i = 0; i < inputList.size(); i++) {
            for (int j = 0; j < inputList.size() - 1; j++) {
                if (inputList.get(j) > inputList.get(j + 1)) {
                    int temp = inputList.get(j);
                    inputList.set(j, inputList.get(j + 1));
                    inputList.set(j + 1, temp);
                }
            }
        }
        return inputList;
    }
}
