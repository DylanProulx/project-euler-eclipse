package p0005;

import math.PrimeNumbersGenerator;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class PrimeNumbersGeneratorTest {

    PrimeNumbersGenerator primes = new PrimeNumbersGenerator();

    @Test
    public void testRunPrimesSieve() throws Exception {
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(2);
        result.add(3);
        result.add(5);
        result.add(7);
        result.add(11);
        result.add(13);
        result.add(17);
        result.add(19);

        ArrayList<Integer> method = primes.runPrimesSieve(20);

        for (int index = 0; index < result.size(); index++) {
            assertEquals(result.get(index), method.get(index));
        }
    }

}