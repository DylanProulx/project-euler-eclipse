package p0006;

import java.math.BigInteger;

/**
 * Implements a solution to Problem 6 on projecteuler.net
 * http://projecteuler.net/problem=6
 *
 * Task:
 * Find the difference between the sum of the squares of the
 * first one hundred natural numbers and the square of the sum.
 *
 * Runtime Complexity:
 * O(3n) where n is the number of natural numbers in the
 * calculation
 *    - One: calculate squares of natural numbers
 *    - Two: add squares to sum
 *    - Three: calculate sum of natural numbers
 *
 * Test Case:
 * The difference between the sum of the squares of the first ten
 * natural numbers and the square of the sum is 3025 − 385 = 2640.
 *
 * @author Eric Honsey
 *
 */
public class RunSumSquareDifference {

    public static void main(String[] args) {

        int small = 1;
        int large = 100;

        SumSquareDifference ssd = new SumSquareDifference();
        BigInteger difference = ssd.getDifference(small, large);
        System.out.println(difference);

    }

}
