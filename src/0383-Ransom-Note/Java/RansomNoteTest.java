import org.junit.*;
import static org.junit.Assert.*;

public class RansomNoteTest {

    private RansomNote ransomNote;

    @Before
    public void setup() {
        ransomNote = new RansomNote();
    }

    @Test
    public void test1() {
        assertFalse(ransomNote.canConstruct("a", "b"));
    }

    @Test
    public void test2() {
        assertFalse(ransomNote.canConstruct("aa", "ab"));
    }

    @Test
    public void test3() {
        assertTrue(ransomNote.canConstruct("aa", "aab"));
    }

}
