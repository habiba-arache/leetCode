import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.leet.Solution;

public class SolutionTest {

    @Test
    public void test0() {
        Solution s = new Solution();
        assertEquals(2147483646, s.myAtoi("2147483646"));
    }

    @Test
    public void test() {
        Solution s = new Solution();
        assertEquals(42, s.myAtoi("42"));
    }

    @Test
    public void test1() {
        Solution s = new Solution();
        assertEquals(-42, s.myAtoi(" -042"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assertEquals(1337, s.myAtoi("1337c0d3"));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        assertEquals(0, s.myAtoi("0-1"));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        assertEquals(0, s.myAtoi("words and 987"));
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        assertEquals(2147483647, s.myAtoi(" 4294967296"));
    }

    @Test
    public void test6() {
        Solution s = new Solution();
        assertEquals(-2147483648, s.myAtoi(" -24294967296"));
    }

    @Test
    public void test7() {
        Solution s = new Solution();
        assertEquals(0, s.myAtoi(" +-12"));
    }

    @Test
    public void test8() {
        Solution s = new Solution();
        assertEquals(0, s.myAtoi("   +0 123"));
    }

    @Test
    public void test9() {
        Solution s = new Solution();
        assertEquals(2147483647, s.myAtoi("18446744073709551617"));
    }
}