package p0003;

/**
 * Implements a solution to Problem 3 on projecteuler.net
 * http://projecteuler.net/problem=3
 *
 * Task:
 * What is the largest prime factor of the number 600851475143?
 *
 * Runtime Complexity (worst case):
 * O(3log2n) where n is the largest factor of the given number
 *    - One: check if n is a factor of the number
 *    - Two: divide factor by n
 *    - Three: decrement factor to check again for square root
 *      case
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
