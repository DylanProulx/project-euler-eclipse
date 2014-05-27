package p0010;

import org.junit.Test;
import sun.security.util.BigInt;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class SumPrimesTest {

    SumPrimes test = new SumPrimes();

    @Test
    public void testGetSum() throws Exception {
        int sum = 17;
        BigInteger result = BigInteger.valueOf(sum);
        assertEquals(result, test.getSum(10));
    }
}