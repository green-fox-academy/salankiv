public class Fibonacci {
	int nthNumber;
	int sum;
	int prevNum;
	int nextNum;

	public Fibonacci() {

	}

	public int getValue(int number) {
		prevNum = 0;
		nextNum = 1;
		for (int i = 1; i <= number; i++) {
			sum = prevNum + nextNum;
			prevNum = nextNum;
			nextNum = sum;
		}
		return sum;
	}

	public static void main(String[] args) {
		Fibonacci newFibo = new Fibonacci();
		System.out.println(newFibo.getValue(0));
	}
}
