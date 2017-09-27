import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {

	//Animal nyuszi = new Animal();

	@Before
	public void creating() {
		Animal nyuszi = new Animal();
	}

	@Test
	public void testHunger() {
		Animal nyuszi = new Animal();
		assertEquals(50, nyuszi.hunger);
	}

	@Test
	public void testThirst() {
		Animal nyuszi = new Animal();
		assertEquals(50, nyuszi.thirst);
	}

	@Test
	public void testEat() {
		Animal nyuszi = new Animal();
		nyuszi.eat();
		assertEquals(49, nyuszi.hunger, 1);
	}

	@Test
	public void testPlay() {
		Animal nyuszi = new Animal();
		nyuszi.play();
		assertEquals(51, nyuszi.hunger, 1);
		assertEquals(51, nyuszi.thirst, 1);
	}
}