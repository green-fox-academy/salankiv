public class Power {
	public static void main(String[] args) {
		System.out.println(powerTheNumber(10, 0));
	}

	private static int powerTheNumber(int base, int power) {
		if (power == 1) {
			return base;
		} else if (power == 0) {
			return 1;
		} else {
				return powerTheNumber(base, power - 1) * base;
		}
	}
}

// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).