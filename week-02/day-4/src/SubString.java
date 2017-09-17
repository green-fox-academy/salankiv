public class SubString {
    public static void main(String[] args) {
        //Create a function that takes two strings as a parameter
        //Returns the starting index where the second one is starting in the first one
        //Returns -1 if the second string is not in the first one

        String firstString = "this is what I'm searching in";
        String secondString = "I";

        System.out.println(subStringIn(firstString, secondString));
    }

    public static int subStringIn(String searchIn, String searchWhat) {
        for (int i = 0; i <= (searchIn.length() - searchWhat.length()); i++) {
            if ((searchIn.substring(i, i + searchWhat.length())).equals(searchWhat)) {
                return i;
            }
        }
        return -1;
    }
}
