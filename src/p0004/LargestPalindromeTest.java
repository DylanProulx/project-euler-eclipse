package p0004;

import org.junit.Test;
import p0003.LargestPrimeFactor;

import static org.junit.Assert.*;

public class LargestPalindromeTest {

    LargestPalindrome testPalindrome = new LargestPalindrome();

    @Test
    // Tests the largest palindrome of 2 two-digit integers
    public void testGetLargestPalindrome() throws Exception {
        int result = 9009;
        assertEquals(result, testPalindrome.getLargestPalindrome(10,99));
    }
}