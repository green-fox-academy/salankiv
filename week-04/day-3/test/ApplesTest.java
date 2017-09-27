import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {
	Apples myApple = new Apples();
	String testString = "apple";

	@Test
	public void testMethod() {
		assertEquals(testString, myApple.getApple());
	}

}