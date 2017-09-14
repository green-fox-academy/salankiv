import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Give me a number:");
        int userNumber = myScanner.nextInt();
        String asterix = "";

        for (int i = 1; i <= userNumber; i++) {
            asterix = asterix + "*";
            System.out.println(asterix);
        }
    }
}
