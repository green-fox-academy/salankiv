public class SumDigit {
	public static void main(String[] args) {
		System.out.println(sumOfDigits(123));
	}

	private static int sumOfDigits(int number) {
		if (number < 10) {
			return number;
		}
		return sumOfDigits(number / 10) + (number % 10);
	}
}

// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while 
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).