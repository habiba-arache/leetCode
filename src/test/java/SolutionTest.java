import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.leet.Solution;

public class SolutionTest {

    @Test
    public void test() {
        Solution s = new Solution();
        String res = s.longestPalindrome("babad");
        assertEquals("bab", res);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        String res = s.longestPalindrome("cbbd");
        assertEquals("bb", res);
    } @Test
    public void test3() {
        Solution s = new Solution();
        String res = s.longestPalindrome("aacabdkacaa");
        assertEquals("aca", res);
    }
}