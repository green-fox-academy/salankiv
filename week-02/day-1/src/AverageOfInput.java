import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Give me a number:");
        int a = myScanner.nextInt();

        System.out.println("Give me a number:");
        int b = myScanner.nextInt();

        System.out.println("Give me a number:");
        int c = myScanner.nextInt();

        System.out.println("Give me a number:");
        int d = myScanner.nextInt();

        System.out.println("Give me a number:");
        int e = myScanner.nextInt();

        int sum = a + b + c + d + e;
        double average = sum / 5;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
