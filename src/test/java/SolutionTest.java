import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.leet.Solution;

public class SolutionTest {

    @Test
    public void test() {
        Solution s = new Solution();
        assertEquals(true, s.isPalindrome(9999));
    }

    @Test
    public void test8() {
        Solution s = new Solution();
        assertEquals(false, s.isPalindrome(100));
    }

    @Test
    public void test1() {
        Solution s = new Solution();
        assertEquals(false, s.isPalindrome(100003001));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        assertEquals(true, s.isPalindrome(1234321));
    }
 

    @Test
    public void test5() {
        Solution s = new Solution();
        assertEquals(false, s.isPalindrome(1000021));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assertEquals(false, s.isPalindrome(-121));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        assertEquals(false, s.isPalindrome(10));
    }
}