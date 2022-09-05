import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.util.*;

public class TestCode {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void test1() {
		List<String> expected = Arrays.asList("1","2","Fizz");
		assertThat(expected, is(solution.fizzBuzz(3)));
    }

    @Test
    public void test2() {
		List<String> expected = Arrays.asList("1","2","Fizz","4","Buzz");
		assertThat(expected, is(solution.fizzBuzz(5)));
    }

    @Test
    public void test3() {
		List<String> expected = Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz");
		assertThat(expected, is(solution.fizzBuzz(15)));
    }

}
