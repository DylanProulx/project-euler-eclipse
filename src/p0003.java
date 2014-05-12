/**
 * Implements a solution to Problem 3 on projecteuler.net
 * http://projecteuler.net/problem=3
 * 
 * What is the largest prime factor of the number 600851475143?
 * 
 * @author Eric Honsey
 *
 */
public class p0003 {
	
	public static void main(String[] args) {
		long l = 600851475143L;
		System.out.println(largestFactor(l));
	}
	
	public static long largestFactor(long n) {
		long i;
		
		for (i = 2; i <= n; i++) {
			if (n % i == 0) {
				n  /= i;
				i--;
			}
		}
		
		return i;
	}

}
