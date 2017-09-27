import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
	Anagram newAnagram;
	String string1 = "dog";
	String string2 = "god";

	@Test
	public void testAnagram() {
		assertTrue(newAnagram.checkAnagram(string1, string2));
	}
}