/**
 * Implements a solution to Problem 4 on projecteuler.net
 * http://projecteuler.net/problem=4
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * @author Eric Honsey
 *
 */
public class p0004 {
	
	public static void main(String[] args) {
		int a = 100;
		int b = 999;
		System.out.println(largestPalindrome(a,b));
	}
	
	public static long largestPalindrome(int a, int b) {
		int result = 0;
		
		for (int i = a; i <= b; i++) {
			for (int j = a; j <= b; j++) {
				int n = i*j;
				if (isPalindrome(n) && n > result) {
					result = n;
				}
			}
		}
		
		return result;
	}
	
	public static boolean isPalindrome (int n) {
		String numStr = Integer.toString(n);
		int len = numStr.length();
		int stop = numStr.length() / 2;
		if (n % 2 == 1) {
			stop++;
		}
		
		for (int i = 0; i <= stop; i++) {
			int j = len - i - 1;
			if (numStr.charAt(i) != numStr.charAt(j)) {
				return false;
			}
		}
		
		return true;
	}

}