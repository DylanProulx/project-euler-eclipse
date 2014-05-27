package p0008;

import sun.security.util.BigInt;

import java.math.BigInteger;

/**
 * Created by Eric on 5/26/2014.
 */
public class GridLargestProduct {

    public BigInteger largestProduct(String grid, int n) {
        BigInteger product = BigInteger.ONE;

        for (int index = 0; index < n; index++) {
            int number = Character.getNumericValue(grid.charAt(index));
            product = product.multiply(BigInteger.valueOf(number));
        }

        int len = grid.length();
        BigInteger max = product;

        for (int index = n; index < len; index++) {
            int previous = Character.getNumericValue(grid.charAt(index - n));
            int next = Character.getNumericValue(grid.charAt(index));

            if (previous == 0) {
                product = BigInteger.valueOf(next);
                for (int j = index - 1; j > index - n; j--) {
                    int number = Character.getNumericValue(grid.charAt(j));
                    product = product.multiply(BigInteger.valueOf(number));
                }
            } else {
                product = product.divide(BigInteger.valueOf(previous));
                product = product.multiply(BigInteger.valueOf(next));
            }

            if (product.compareTo(max) > 0) {
                max = product;
            }
        }

        return max;
    }

}
