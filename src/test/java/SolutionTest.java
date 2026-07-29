import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.leet.Solution;

public class SolutionTest {

    @Test
    public void test() {
        Solution s = new Solution();
        assertEquals(49, s.maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
    }

    @Test
    public void test1() {
        Solution s = new Solution();
        assertEquals(1, s.maxArea(new int[] { 1, 1 }));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assertEquals(16, s.maxArea(new int[] { 4, 3, 2, 1, 4 }));
    }
}