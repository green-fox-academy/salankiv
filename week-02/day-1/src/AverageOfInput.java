import java.nio.file.Files;
import java.util.Scanner;
import java.util.stream.Stream;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Give me 5 numbers:");

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = myScanner.nextInt();
        }
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        double average = sum / 5;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
