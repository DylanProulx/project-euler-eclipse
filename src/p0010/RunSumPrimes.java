package p0010;

import java.math.BigInteger;

/**
 * Implements a solution to Problem 10 on projecteuler.net
 * http://projecteuler.net/problem=10
 *
 * Task:
 * Find the sum of all the primes below two million.
 *
 * Runtime Complexity:
 * O(2n) where n is the limit of the function
 *
 * Test Case:
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * @author Eric Honsey
 *
 */
public class RunSumPrimes {

    public static void main(String[] args) {
        int limit = 2000000;

        SumPrimes sumPrimes = new SumPrimes();
        BigInteger sum = sumPrimes.getSum(limit);
        System.out.println(sum);
    }

}
