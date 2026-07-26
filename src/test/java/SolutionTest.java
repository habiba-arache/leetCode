import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.leet.Solution;

public class SolutionTest {

    private static final double DELTA = 0.002;

    private final Solution solution = new Solution();

    @Test
    public void testSqrt0() {
        assertEquals(Math.sqrt(0), solution.sqrt(0, DELTA), DELTA);
    }

    @Test
    public void testSqrt1() {
        assertEquals(Math.sqrt(1), solution.sqrt(1, DELTA), DELTA);
    }

    @Test
    public void testSqrt2() {
        assertEquals(Math.sqrt(2), solution.sqrt(2, DELTA), DELTA);
    }

    @Test
    public void testSqrt3() {
        assertEquals(Math.sqrt(3), solution.sqrt(3, DELTA), DELTA);
    }

    @Test
    public void testSqrt4() {
        assertEquals(Math.sqrt(4), solution.sqrt(4, DELTA), DELTA);
    }

    @Test
    public void testSqrt9() {
        assertEquals(Math.sqrt(9), solution.sqrt(9, DELTA), DELTA);
    }

    @Test
    public void testSqrt17() {
        assertEquals(Math.sqrt(17), solution.sqrt(17, DELTA), DELTA);
    }

    @Test
    public void testSqrt25() {
        assertEquals(Math.sqrt(25), solution.sqrt(25, DELTA), DELTA);
    }
}