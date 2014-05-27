package p0009;

/**
 * Implements a solution to Problem 9 on projecteuler.net
 * http://projecteuler.net/problem=9
 *
 * Task:
 * There exists exactly one Pythagorean triplet for
 * which a + b + c = 1000. Find the product abc.
 *
 * Runtime Complexity (worst case):
 * O(n^2) where n is the target sum of the function
 *
 * Test Case:
 * 3^2 + 4^2 = 9 + 16 = 25. Sum of triplet = 50.
 *
 * @author Eric Honsey
 *
 */
public class RunPythagoreanTriplet {

    public static void main(String[] args) {
        int target = 1000;

        PythagoreanTriplet triplet = new PythagoreanTriplet();
        triplet.generateTriplet(target);

//        System.out.println(triplet.getA());   // returns 200
//        System.out.println(triplet.getB());   // returns 375
//        System.out.println(triplet.getC());   // returns 425

        int product = triplet.getA() * triplet.getB() * triplet.getC();
        System.out.println(product);
    }

}
