public class Counter {

	int counter;
	int startValue;

	public Counter() {
		startValue = 0;
		counter = startValue;
	}

	public Counter(int startValue) {
		this.startValue = startValue;
		this.counter = startValue;
	}

	public void add(int number) {
		counter += number;
	}

	public void add() {
		counter += 1;
	}

	public int get() {
		return counter;
	}

	public void reset() {
		counter = startValue;
	}
}
