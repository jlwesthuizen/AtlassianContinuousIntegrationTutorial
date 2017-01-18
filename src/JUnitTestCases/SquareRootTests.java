package JUnitTestCases;

import static org.junit.Assert.*;
import org.junit.Test;
import Mathematical.SquareRoot;

public class SquareRootTests {

	@Test
	public void JUnitTest1() {
		SquareRoot sqrt = new SquareRoot();
		assertTrue(sqrt.getSquareRoot(4) == 2);
	}
}
