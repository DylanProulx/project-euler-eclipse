package p0006;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class SumSquareDifferenceTest {

    SumSquareDifference test = new SumSquareDifference();

    @Test
    public void testGetDifference() throws Exception {
        int difference = 2640;
        BigInteger result = BigInteger.valueOf(difference);
        assertEquals(result, test.getDifference(1,10));
    }
}