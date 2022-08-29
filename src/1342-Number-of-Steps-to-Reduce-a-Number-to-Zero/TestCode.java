import org.junit.*;
import static org.junit.Assert.*;

public class TestCode {

	private Solution solution;

	@Before
	public void setup() {
		solution = new Solution();
	}

	@Test
	public void test1() {
		assertEquals(6, solution.numberOfSteps(14));
	}

	@Test
	public void test2() {
		assertEquals(4, solution.numberOfSteps(8));
	}

	@Test
	public void test3() {
		assertEquals(12, solution.numberOfSteps(123));
	}

}
