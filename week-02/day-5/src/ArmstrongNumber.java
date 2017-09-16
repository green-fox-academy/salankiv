import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        System.out.println("Give me a number:");
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();

        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            int number = input.charAt(i) - 48;
            numberList.add(number);
        }

        int sumOfDigits = 0;
        for (int i = 0; i < numberList.size(); i++) {
            int currentDigit = numberList.get(i);
            for (int j = 1; j < numberList.size(); j++) {
                currentDigit = currentDigit * numberList.get(i);
            }
            sumOfDigits = sumOfDigits + currentDigit;
        }

        int originalNumber = Integer.valueOf(input);
        if (sumOfDigits == originalNumber) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is NOT an Armstrong number.");
        }
    }
}