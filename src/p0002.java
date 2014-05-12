/**
 * Implements a solution to Problem 2 on projecteuler.net
 * http://projecteuler.net/problem=2
 * 
 * By considering the terms in the Fibonacci sequence whose
 * values do not exceed four million, find the sum of the
 * even-valued terms.
 * 
 * @author Eric Honsey
 *
 */
public class p0002 {
	
	public static void main(String[] args) {
		int n = 4000000;
		System.out.println(fib(n));
	}
	
	public static int fib(int n) {
		int curr = 1;
		int prev = 1;
		int sum = 0;
		
		while (curr <= n) {
			if (isEven(curr)) {
				sum += curr;
			}
			int temp = curr + prev;
			prev = curr;
			curr = temp;
		}
		
		return sum;
	}
	
	public static boolean isEven(int n) {
		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
