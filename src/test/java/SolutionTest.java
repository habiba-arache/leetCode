
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.leet.Solution;

public class SolutionTest {

    @Test
    public void test() {
        Solution s = new Solution();
        assertEquals("fl", s.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
    @Test
    public void test1() {
        Solution s = new Solution();
        assertEquals("", s.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}
