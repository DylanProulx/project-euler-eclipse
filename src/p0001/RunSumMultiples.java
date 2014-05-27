package p0001;

/**
 * Implements a solution to Problem 1 on projecteuler.net
 * http://projecteuler.net/problem=1
 *
 * Task:
 * Find the sum of the multiples below 3 and 5 below 1000
 *
 * Runtime Complexity (worst case):
 * O(2n) where n is the limit of the function
 *
 * Test Case:
 * If we list all the natural numbers below 10 that are
 * multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of
 * these multiples is 23.
 *
 * @author Eric Honsey
 *
 */
public class RunSumMultiples {

	public static void main(String[] args) {
		int limit = 1000;
		SumMultiples35 sum = new SumMultiples35();
        System.out.println(sum.getSum(limit));
	}
	
}
