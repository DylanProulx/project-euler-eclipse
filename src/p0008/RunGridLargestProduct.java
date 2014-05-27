package p0008;

import java.math.BigInteger;

/**
 * Implements a solution to Problem 8 on projecteuler.net
 * http://projecteuler.net/problem=8
 *
 * Task:
 * Find the greatest product of five consecutive digits
 * in the 1000-digit number.
 *
 * Runtime Complexity (best case):
 * O(n) where n is the number of digits in the number grid
 *
 * Test Case:
 * The four adjacent digits in the 1000-digit number that
 * have the greatest product are 9 × 9 × 8 × 9 = 5832.
 *
 * @author Eric Honsey
 *
 */
public class RunGridLargestProduct {

    public static void main(String[] args) {
        BuildNumberGrid bng = new BuildNumberGrid();
        String grid = bng.numberGrid("input-files/Number-oldSolutions.p0008.txt");

        GridLargestProduct glp = new GridLargestProduct();
        BigInteger result = glp.largestProduct(grid, 13);
        System.out.println(result);
    }

}
