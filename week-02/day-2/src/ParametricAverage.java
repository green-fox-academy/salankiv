import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4

        Scanner myScanner = new Scanner(System.in);
        int numOfNumbers = 7;
        int[] numbers = new int[numOfNumbers];

        for (int i = 0; i < numOfNumbers; i++) {
            System.out.println("Give a number: ");
            numbers[i] = myScanner.nextInt();
        }

        int sumOfNumbers = 0;

        for (int i = 0; i < numOfNumbers; i++) {
            sumOfNumbers = sumOfNumbers + numbers[i];
        }

        float avgOfNumbers = (float) sumOfNumbers / (float) numOfNumbers;

        System.out.printf("Sum: " + sumOfNumbers + ", Average: " + "%.1f", avgOfNumbers);
    }
}
