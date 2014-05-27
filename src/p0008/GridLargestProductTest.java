package p0008;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class GridLargestProductTest {

    BuildNumberGrid bng = new BuildNumberGrid();
    String grid = bng.numberGrid("input-files/Number-oldSolutions.p0008.txt");

    GridLargestProduct test = new GridLargestProduct();

    @Test
    public void testLargestProduct() throws Exception {
        int number = 5832;
        BigInteger result = BigInteger.valueOf(number);
        assertEquals(result, test.largestProduct(grid, 4));
    }
}