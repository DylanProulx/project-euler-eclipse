package p0002;

import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciGeneratorTest {

    FibonacciGenerator testFibonacci = new FibonacciGenerator();

    @Test
    public void testSumEvens() throws Exception {
        int sum = 44;
        testFibonacci.generateArrayList(100);
        assertEquals(sum, testFibonacci.sumEvens());
    }
}