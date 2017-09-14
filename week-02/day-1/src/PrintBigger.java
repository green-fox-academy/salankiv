import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Give me a number:");
        int first = myScanner.nextInt();
        System.out.println("Give me a number:");
        int second = myScanner.nextInt();

        if (first > second) {
            System.out.println(first);
        } else {
            System.out.println(second);
        }
    }
}
