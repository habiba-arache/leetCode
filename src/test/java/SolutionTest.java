import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.leet.Solution;

public class SolutionTest {

    // abcabcdefga
    @Test
    public void test1() {
        Solution Solution = new Solution();
        int result = Solution.lengthOfLongestSubstring("abcabcbb");
        assertEquals(3, result);
    }

    @Test
    public void test2() {
        Solution Solution = new Solution();
        int resrult = Solution.lengthOfLongestSubstring("bbbbb");
        assertEquals(1, resrult);
    }

    @Test
    public void test3() {
        Solution Solution = new Solution();
        int resrult = Solution.lengthOfLongestSubstring("pwwkew");
        assertEquals(3, resrult);
    }

    @Test
    public void test4() {
        Solution Solution = new Solution();
        int resrult = Solution.lengthOfLongestSubstring("aabaab!bb");
        assertEquals(3, resrult);
    }
}