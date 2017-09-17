import java.util.ArrayList;
import java.util.Arrays;

public class SubStringList {
    public static void main(String[] args) {
        //Create a function that takes a string and a list of string as a parameter
        //Returns the index of the string in the list where the first string is part of
        //Returns -1 if the string is not part any of the strings in the list


        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("this", "is", "what", "I'm", "searching", "in"));
        String subString = "is";

        System.out.println(stringInList(stringList, subString));
    }

    public static ArrayList<Integer> stringInList(ArrayList<String> stringList, String subString) {
        ArrayList<Integer> listOfIndexes = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).contains(subString)) {
                listOfIndexes.add(i);
            }
        }
        return listOfIndexes;
    }
}
