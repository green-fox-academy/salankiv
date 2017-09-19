import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		// create a function that takes a number
		// divides ten with it,
		// and prints the result.
		// it should print "fail" if the parameter is 0
		Scanner myScanner = new Scanner(System.in);
		int number = myScanner.nextInt();

		try {
			double result = 10 / (double) number;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("fail");
		}
	}
}