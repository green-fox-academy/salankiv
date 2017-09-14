import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Give me a number:");
        int height = myScanner.nextInt();
        String asterix = "*";
        String whiteSpace = "";

        System.out.println(asterix);
        for (int i = 1; i < height; i++) {
            for (int k = 0; k <= (height - i); k++) {
                whiteSpace = whiteSpace + " ";
                System.out.print(whiteSpace);
                whiteSpace = "";
            }
            for (int j = 0; j <= i; j = j + 2) {
                asterix = asterix + "**";
            }
            System.out.println(asterix);
        }
    }
}
