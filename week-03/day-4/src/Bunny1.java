public class Bunny1 {
	public static void main(String[] args) {
		System.out.println(numberOfEars(14));
	}

	private static int numberOfEars(int number) {
		if (number == 0) {
			return 0;
		}
		return numberOfEars(number - 1) + 2;
	}
}

// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
