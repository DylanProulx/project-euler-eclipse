package p0007;

import org.junit.Test;

import static org.junit.Assert.*;

public class NthPrimeGeneratorTest {

    NthPrimeGenerator test = new NthPrimeGenerator();

    @Test
    public void testGetNthPrime() throws Exception {
        int result = 13;
        assertEquals(result, test.getNthPrime(6));
    }
}