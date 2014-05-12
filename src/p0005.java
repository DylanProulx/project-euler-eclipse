/**
 * Implements a solution to Problem 5 on projecteuler.net
 * http://projecteuler.net/problem=5
 * 
 * What is the smallest positive number that is evenly 
 * divisible by all of the numbers from 1 to 20?
 * 
 * @author Eric Honsey
 *
 */
public class p0005 {
	
	public static void main(String[] args) {
		int a = 1;
		int b = 20;
		System.out.println(getNum(a,b));
	}

	public static int getNum(int a, int b) {
		int n = 0;
		boolean divisible = false;
		
		while (!divisible) {
			n++;
			if (divisibleByRange(n,a,b)) {
				divisible = true;
			}
		}
		
		return n;
	}
	
	public static boolean divisibleByRange(int n, int a, int b) {
		for (int i = a; i <= b; i++) {
			if (n % i != 0) {
				return false;
			}
		}
		
		return true;
	}
}
