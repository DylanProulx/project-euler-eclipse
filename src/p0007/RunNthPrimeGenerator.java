package p0007;

/**
 * Implements a solution to Problem 7 on projecteuler.net
 * http://projecteuler.net/problem=7
 *
 * Task:
 * What is the 10,001st prime number?
 *
 * Runtime Complexity:
 * O(2m) where m is m the number of elements
 * in the PrimeGenerator array (in this case, 2 million)
 *
 * Test Case:
 * By listing the first six prime numbers: 2, 3, 5, 7, 11,
 * and 13, we can see that the 6th prime is 13.
 *
 * @author Eric Honsey
 *
 */
public class RunNthPrimeGenerator {

    public static void main(String[] args) {
        int n = 10001;
        NthPrimeGenerator primes = new NthPrimeGenerator();
        int result = primes.getNthPrime(n);
        System.out.println(result);
    }

}
