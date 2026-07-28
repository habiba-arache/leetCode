import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.leet.Solution;

public class SolutionTest {

    @Test
    public void test() {
        Solution s = new Solution();
        assertEquals(false, s.isMatch("aa", "a"));
    }

    @Test
    public void test1() {
        Solution s = new Solution();
        assertEquals(true, s.isMatch("aa", "a*"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assertEquals(true, s.isMatch("ab", ".*"));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        assertEquals(true, s.isMatch("aab", "c*a*b"));
    }
    
    @Test
    public void test4() {
        Solution s = new Solution();
        assertEquals(false, s.isMatch("mississippi", "mis*is*p*."));
    }
    @Test
    public void test5() {
        Solution s = new Solution();
        assertEquals(false, s.isMatch("ab", ".*c"));
    }
}