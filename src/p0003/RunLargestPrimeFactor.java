package p0003;

/**
 * Implements a solution to Problem 3 on projecteuler.net
 * http://projecteuler.net/problem=3
 * 
 * What is the largest prime factor of the number 600851475143?
 * 
 * @author Eric Honsey
 *
 */
public class RunLargestPrimeFactor {
	
	public static void main(String[] args) {
		LargestPrimeFactor factor = new LargestPrimeFactor();
		long l = 600851475143L;
		System.out.println(factor.getLargestFactor(l));
	}

}
