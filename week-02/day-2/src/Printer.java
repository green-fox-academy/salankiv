import java.util.Scanner;

public class Printer {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Create a function called `printer`
        //   which prints the input String parameters
        // - It can have any number of parameters

        // Examples
        // printer("first")
        // printer("first", "second")
        // printer("first", "second", "third", "fourh")
        // ...

        System.out.println("Give me a number, how many strings you want to add:");
        Scanner myScanner = new Scanner(System.in);
        int stringNumber = myScanner.nextInt();
        String[] myArray = new String[stringNumber];

        for (int i = 1; i <= stringNumber; i++) {
            System.out.println("Give me the " + i + ". string:");
            myArray[i-1] = myScanner.next();
        }

        System.out.println(printer(myArray));

    }

    public static String printer(String[] inputArray) {
        String sumArray = "";
        for (int i = 1; i <= inputArray.length; i++) {
            sumArray = sumArray + inputArray[i-1] + ", ";
        }
        return sumArray;

    }

}