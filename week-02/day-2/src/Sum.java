import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Write a function called `sum` that sum all the numbers
        //   until the given parameter

        System.out.println("Give me a number:");
        Scanner myScanner = new Scanner(System.in);
        int userNumber = myScanner.nextInt();
        System.out.println(sum(userNumber));

    }

    public static int sum(int input) {
        int sumNumber = 0;
        for (int i = 0; i <= input; i++) {
            sumNumber = sumNumber + i;
        }
        return sumNumber;
    }
}
