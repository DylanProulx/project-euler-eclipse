import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Implements a solution to Problem 10 on projecteuler.net
 * http://projecteuler.net/problem=10
 * 
 * FFind the sum of all the primes below two million.
 * 
 * @author Eric Honsey
 *
 */
public class p0010 {
	
	public static void main(String[] args) {
		int limit = 2000000;
		
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		for (int i = 2; i < limit; i++) {
			if (isPrime(i)) {
				primeList.add(i);
			}
		}
		
		System.out.println(sumPrimes(primeList));
	}
	
	public static BigInteger sumPrimes(ArrayList<Integer> primeList) {
		BigInteger sum = BigInteger.ZERO;
		
		for (int element : primeList) {
			BigInteger bn = new BigInteger(Integer.toString(element));
			sum = sum.add(bn);
		}
		
		return sum;
	}
	
	public static boolean isPrime(int n) {
		int i = 2;

		while (i * i <= n) {
			if (n % i == 0) {
				return false;
			}
			i++;
		}

		return true;
	}

}
