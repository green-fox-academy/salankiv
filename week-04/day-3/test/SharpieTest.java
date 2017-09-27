import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {
	Sharpie newSharpie = new Sharpie("brown", 20.5f);

	@Test
	public void testColor() {
		assertEquals("brown", newSharpie.color);
	}

	@Test
	public void testUse() {
		newSharpie.use();
		assertEquals(90, newSharpie.inkAmount, 10);
	}
}