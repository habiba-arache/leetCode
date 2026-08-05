
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.leet.Solution;

public class SolutionTest {

    @Test
    public void test() {
        Solution s = new Solution();
        assertEquals("MMMDCCXLIX", s.intToRoman(3749));
    }

    @Test
    public void test1() {
        Solution s = new Solution();
        assertEquals("LVIII", s.intToRoman(58));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assertEquals("MCMXCIV", s.intToRoman(1994));
    }
}
