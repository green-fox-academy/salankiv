import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Give me the number range starting from:");
        int fromRange = myScanner.nextInt();
        System.out.println("Give me the number range ending:");
        int endRange = myScanner.nextInt();

        int numberToGuess = (int) (((endRange - fromRange) * Math.random()) + fromRange);
        int lives = 5;

        System.out.println("I have the number between " + fromRange + "-" + endRange + ". You have " + lives + " lives.");

        int guess = myScanner.nextInt();

        while (lives > 1) {
            if (guess == numberToGuess) {
                System.out.println("Congratulations. You won!");
                break;
            } else if (guess > numberToGuess) {
                lives -= 1;
                System.out.println("Too high! You have " + lives + " left.");
                guess = myScanner.nextInt();
            } else if (guess < numberToGuess) {
                lives -= 1;
                System.out.println("Too low! You have " + lives + " left.");
                guess = myScanner.nextInt();
            }
        }
        System.out.println("Sorry, you lost!");
    }
}
