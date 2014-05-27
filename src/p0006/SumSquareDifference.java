package p0006;

import math.Functions;

import java.math.BigInteger;

/**
 * Created by Eric on 5/26/2014.
 */
public class SumSquareDifference {

    public BigInteger getDifference(int small, int large) {
        BigInteger smallest = BigInteger.valueOf(small);
        BigInteger largest = BigInteger.valueOf(large);

        BigInteger sumSquares = Functions.sumofSquares(smallest, largest);
        BigInteger squareSum = Functions.squareOfSums(smallest, largest);

        return squareSum.subtract(sumSquares);
    }

}
