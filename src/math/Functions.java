package math;

import java.math.BigInteger;

/**
 * Created by Eric on 5/26/2014.
 */
public class Functions {

    public static BigInteger sumofSquares(BigInteger smallest, BigInteger largest) {
        BigInteger sum = BigInteger.ZERO;
        BigInteger n = smallest;

        while(n.compareTo(largest) <= 0) {
            BigInteger square = n.multiply(n);
            sum = sum.add(square);
            n = n.add(BigInteger.ONE);
        }

        return sum;
    }

    public static BigInteger squareOfSums(BigInteger smallest, BigInteger largest) {
        BigInteger sum = BigInteger.ZERO;
        BigInteger n = smallest;

        while(n.compareTo(largest) <= 0) {
            sum = sum.add(n);
            n = n.add(BigInteger.ONE);
        }

        return sum.multiply(sum);
    }

}
