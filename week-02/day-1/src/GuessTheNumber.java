import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stried number is lower
        // You found the number: 8

        int number = 8;

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Guess the number:");
        int guess = myScanner.nextInt();

        while (true) {
            if (number > guess) {
                System.out.println("The stored number is higher");
                guess = myScanner.nextInt();
            } else if (number < guess) {
                System.out.println("The stored number is lower");
                guess = myScanner.nextInt();
            }   else {
                System.out.println("You found the number: " + number);
                break;
            }
        }

    }
}
