package p0004;

import math.Booleans;

/**
 * Created by Eric on 5/26/2014.
 */
public class LargestPalindrome {

    public static int getLargestPalindrome(int smallest, int largest) {
        int result = 0;

        for (int i = smallest; i <= largest; i++) {
            for (int j = smallest; j <= largest; j++) {
                int n = i * j;
                String numString = Integer.toString(n);
                if (Booleans.isPalindrome(numString) && n > result) {
                    result = n;
                }
            }
        }

        return result;
    }

}
