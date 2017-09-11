import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Give me a number, that is bigger than 2:");
        int userNumber = myScanner.nextInt();

        String percent = "";

        for (int i = 1; i <= userNumber; i++) {
            percent = percent + "%";
        }
        System.out.println(percent);

        String increaseSpace = "";
        String decreaseSpace = "";

        for (int i = 1; i <= userNumber - 2; i++) {

            for (int j = 1; j <= userNumber - (2 + i); j++) {
                decreaseSpace = decreaseSpace + " ";
            }

            System.out.println("%" + increaseSpace + "%" + decreaseSpace + "%");
            increaseSpace = increaseSpace + " ";
            decreaseSpace = "";
        }

        System.out.println(percent);
    }
}
