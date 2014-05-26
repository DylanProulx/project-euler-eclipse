package p0003;

import org.junit.Test;
import static org.junit.Assert.*;

public class LargestPrimeFactorTest {

    LargestPrimeFactor factor = new LargestPrimeFactor();

    @Test
    public void testGetLargestFactor() throws Exception {
        int value = 13195;
        int largest = 29;
        assertEquals(largest, factor.getLargestFactor(value));
    }
}