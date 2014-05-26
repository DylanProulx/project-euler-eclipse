package p0004;

/**
 * Implements a solution to Problem 4 on projecteuler.net
 * http://projecteuler.net/problem=4
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * Runtime Complexity: O((n+1)^2) where n equals the difference between the
 * largest value and the smallest value.
 *
 * @author Eric Honsey
 *
 */
public class RunLargestPalindrome {

    public static void main(String[] args) {

        int smallest = 100;
        int largest = 999;

        LargestPalindrome palindrome = new LargestPalindrome();
        int result = palindrome.getLargestPalindrome(smallest, largest);
        System.out.println(result);

    }

}
