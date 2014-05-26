package p0001;

import org.junit.Test;
import static org.junit.Assert.*;

public class SumMultiples35Test {

    SumMultiples35 sum = new SumMultiples35();

    @Test
    public void testGetSum() throws Exception {
        int value = 23;
        assertEquals(value, sum.getSum(10));
    }
}