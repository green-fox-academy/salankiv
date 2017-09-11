import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number in km");
        int km = scanner.nextInt();
        double mile = km * 0.621371192;
        System.out.println("This is in miles: " + mile);
    }
}