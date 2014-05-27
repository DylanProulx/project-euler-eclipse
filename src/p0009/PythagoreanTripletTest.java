package p0009;

import org.junit.Test;

import static org.junit.Assert.*;

public class PythagoreanTripletTest {

    PythagoreanTriplet test = new PythagoreanTriplet();

    @Test
    public void testGenerateTriplet() throws Exception {
        int result = 12;  // Sum of triplet 3,4,5
        test.generateTriplet(result);

        int a = 3;
        int b = 4;
        int c = 5;

        assertEquals(a, test.getA());
        assertEquals(b, test.getB());
        assertEquals(c, test.getC());
    }
}