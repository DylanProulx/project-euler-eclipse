/**
 * Implements a solution to Problem 6 on projecteuler.net
 * http://projecteuler.net/problem=6
 * 
 * Find the difference between the sum of the squares of the 
 * first one hundred natural numbers and the square of the sum.
 * 
 * @author Eric Honsey
 *
 */
public class p0006 {
	
	public static void main(String[] args) {
		int limit = 100;
		System.out.println(squareSumDiff(limit));
	}
	
	public static long squareSumDiff(int n) {
		return squareOfSum(n) - sumOfSquares(n);
	}

	public static long sumOfSquares(int n) {
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i * i;
		}
		
		return sum;
	}
	
	public static int squareOfSum(int n) {
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		
		return sum * sum;
	}
}
