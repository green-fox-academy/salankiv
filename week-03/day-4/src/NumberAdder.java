public class NumberAdder {
	public static void main(String[] args) {
		System.out.println(numberAdder(100));
	}

	private static int numberAdder(int number) {
		if (number == 0) {
			return 0;
		}
		System.out.println(number);
		return numberAdder(number - 1) + number;
	}
}
// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.