
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.leet.Solution;

public class SolutionTest {

    @Test
    public void test() {
        Solution s = new Solution();
        assertEquals(3, s.romanToInt("III"));
    }
    @Test
    public void test1() {
        Solution s = new Solution();
        assertEquals(58, s.romanToInt("LVIII"));
    }
    @Test
    public void test2() {
        Solution s = new Solution();
        assertEquals(1994, s.romanToInt("MCMXCIV"));
    }
}
