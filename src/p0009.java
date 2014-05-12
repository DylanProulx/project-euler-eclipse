/**s
 * Implements a solution to Problem 9 on projecteuler.net
 * http://projecteuler.net/problem=9
 * 
 * There exists exactly one Pythagorean triplet for 
 * which a + b + c = 1000.
 * Find the product abc.
 * 
 * @author Eric Honsey
 *
 */
public class p0009 {
	
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		int target = 1000;

		for (int i = 1; i <= target; i++) {
			for (int j = 1; j <= target; j++) {
				for (int k = 1; k <= target; k++) {
					if (i * i + j * j == k * k && i + j + k == target) {
						a = i;
						b = j;
						c = k;
						break;
					}
				}
			}
		}

//		System.out.println(a);  // returns 375
//		System.out.println(b);  // returns 200
//		System.out.println(c);  // returns 425
		System.out.println(a * b * c);

	}

}
