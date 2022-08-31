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
		int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
		int expect= 6;
		assertEquals(expect, solution.maximumWealth(accounts));
    }

    @Test
    public void test2() {
		int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
		int expect= 10;
		assertEquals(expect, solution.maximumWealth(accounts));
    }

    @Test
    public void test3() {
		int[][] accounts = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
		int expect= 17;
		assertEquals(expect, solution.maximumWealth(accounts));
    }

}
