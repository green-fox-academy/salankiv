import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {
	Sum mySum = new Sum();
	List<Integer> testlist = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
	List<Integer> testlist1 = new ArrayList<>(Arrays.asList());
	List<Integer> testlist2 = new ArrayList<>(Arrays.asList());

	@Test
		public void testSumMethod() {
			assertEquals(15, mySum.sumMethod(testlist));
	}

	@Test
		public void testSumMethod1() {
			assertEquals(0, mySum.sumMethod(testlist1));
	}

	@Test
	public void testSumMethod2() {
		assertEquals(null, mySum.sumMethod(testlist2));
	}
}