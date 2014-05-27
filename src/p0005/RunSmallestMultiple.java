package p0005;

/**
 * Implements a solution to Problem 5 on projecteuler.net
 * http://projecteuler.net/problem=5
 *
 * Task:
 * What is the smallest positive number that is evenly
 * divisible by all of the numbers from 1 to 20?
 *
 * Runtime Complexity (average case):
 * O(mn) where m is the solution to the problem and n is
 * the average number of iterations between the smallest
 * and largest numbers in the divisor range
 *
 * Test Case:
 * 2520 is the smallest number that can be divided by each
 * of the numbers from 1 to 10 without any remainder.
 *
 * @author Eric Honsey
 *
 */
public class RunSmallestMultiple {

    public static void main(String[] args) {

        SmallestMultiple multiple = new SmallestMultiple();
        int result = multiple.getSmallestMultiple(1,20);
        System.out.println(result);

    }

}
