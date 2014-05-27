package p0010;

import math.PrimeNumbersGenerator;
import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by Eric on 5/26/2014.
 */
public class SumPrimes {

    public BigInteger getSum(int limit) {
        BigInteger sum = BigInteger.ZERO;

        PrimeNumbersGenerator png = new PrimeNumbersGenerator();
        ArrayList<Integer> primesList = png.runPrimesSieve(limit - 1);

        for (Integer prime: primesList) {
            sum = sum.add(BigInteger.valueOf(prime));
        }

        return sum;
    }
}
