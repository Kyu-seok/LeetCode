import org.junit.*;
import static org.junit.Assert.*;

public class TwoSumTest {

  private TwoSum twoSum;

  @Before
  public void setup() {
    twoSum = new TwoSum();
  }

  @Test
  public void test1() {
    int[] expected = {0, 1};
    int[] inputNums = {2, 7, 11, 15};
    assertArrayEquals(expected, twoSum.twoSum(inputNums, 9));
  }

  @Test
  public void test2() {
    assertEquals(2, 2);
  }

  @Test
  public void test3() {
    assertEquals(3, 3);
  }

}
