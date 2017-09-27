import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {
	CountLetters testCount = new CountLetters();
	String testString = "alma";

	@Test
	public void testCounting() {
		assertEquals(Integer.toString(1), Integer.toString(testCount.getDictionary(testString).get('l')));
	}

	@Test
	public void testCounting1() {
		assertEquals(Integer.valueOf(2), testCount.getDictionary(testString).get('a'));
	}

	@Test
	public void testCounting2() {
		assertTrue(null == testCount.getDictionary(testString).get('b'));
	}
}