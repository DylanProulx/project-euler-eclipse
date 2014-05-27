package p0002;

/**
 * Implements a solution to Problem 2 on projecteuler.net
 * http://projecteuler.net/problem=2
 *
 * Task:
 * By considering the terms in the Fibonacci sequence whose
 * values do not exceed four million, find the sum of the
 * even-valued terms.
 *
 * Runtime Complexity:
 * O(2log2n) where n is the limit of the fibonacci sequence
 *
 * Test Case:
 * The sum of the even fibonacci numbers up to 100 is 44
 *
 * @author Eric Honsey
 *
 */
public class RunFibonacciSum {

	public static void main(String[] args) {
		FibonacciGenerator fg = new FibonacciGenerator();
		
		// Fills arrayList with fibonacci sequence up to limit
        int limit = 4000000;
        fg.generateArrayList(limit);

        int sum;
		sum = fg.sumEvens();
		
		System.out.println(sum);
	}

}
