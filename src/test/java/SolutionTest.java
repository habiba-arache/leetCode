import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.leet.Solution;

public class SolutionTest {

    @Test
    public void test2() {
        Solution Solution = new Solution();
        double resrult = Solution.findMedianSortedArrays(new int[] { 1, 3 }, new int[] { 2 });
        assertEquals(2.0000, resrult, 0.0000001);
    }

    @Test
    public void test3() {
        Solution Solution = new Solution();
        double resrult = Solution.findMedianSortedArrays(new int[] { 1, 2 }, new int[] { 3, 4 });
        assertEquals(2.5000, resrult, 0.0000001);
    }

}