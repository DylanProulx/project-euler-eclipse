/**
 * Implements a solution to Problem 1 on projecteuler.net
 * http://projecteuler.net/problem=1
 * 
 * Find the sum of the multiples below 3 and 5 below 1000
 * 
 * @author Eric Honsey
 *
 */
public class p0001 {
	
	public static void main(String[] args) {
		int n = 1000;
		System.out.println(sum35(n));  
	}
		
	public static int sum35(int n) {
		int sum = 0;
				
		for (int i = 3; i < n; i += 3 ) {
			sum += i;
		}
		
		for (int i = 5; i < n; i += 5) {
			if (i % 3 != 0) {
				sum += i;
			}
		}
		
		return sum;
	}
	
}
