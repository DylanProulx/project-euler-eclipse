package p0005;

import org.junit.Test;

import static org.junit.Assert.*;

public class SmallestMultipleTest {

    SmallestMultiple test = new SmallestMultiple();

    @Test
    public void testGetSmallestMultiple() throws Exception {
        int result = 2520;
        assertEquals(result, test.getSmallestMultiple(1,10));
    }
}