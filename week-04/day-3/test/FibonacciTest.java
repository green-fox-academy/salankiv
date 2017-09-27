import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
	Fibonacci newFibo = new Fibonacci();

	@Test
	public void testFibo() {
		assertTrue(8 == newFibo.getValue(5));
	}

	@Test
	public void testFibo1() {
		assertFalse(5 != newFibo.getValue(4));
	}

	@Test
	public void testFibo2() {
		assertTrue(0 == newFibo.getValue(0));
	}
}