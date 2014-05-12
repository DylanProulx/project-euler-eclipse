/**
 * Implements a solution to Problem 7 on projecteuler.net
 * http://projecteuler.net/problem=7
 * 
 * What is the 10,001st prime number?
 * 
 * @author Eric Honsey
 *
 */
public class p0007 {
	
	public static void main(String[] args) {
		int n = 10001;
		System.out.println(primeN(n));
	}
	
	public static int primeN(int n) {
		int primeCount = 0;
		int i = 0;
		
		while (primeCount <= n) {
			i++;
			if (isPrime(i)) {
				primeCount++;
			}
		}
	
		return i;
	}
	
	public static boolean isPrime(int n) {
		int i = 2;
		
		while (i * i <= n) {
			if(n % i == 0) {
				return false;
			}
			i++;
		}
		
		return true;
	}

}
