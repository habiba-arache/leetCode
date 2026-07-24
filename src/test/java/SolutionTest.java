import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.leet.Solution;

public class SolutionTest {

    @Test
    public void test() {
        Solution s = new Solution();
        assertEquals(321, s.reverse(123));
    }

    @Test
    public void test1() {
        Solution s = new Solution();
        assertEquals(-321, s.reverse(-123));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assertEquals(21, s.reverse(120));
    }
}