import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Implements a solution to Problem 8 on projecteuler.net
 * http://projecteuler.net/problem=8
 * 
 * Find the greatest product of five consecutive digits 
 * in the 1000-digit number.
 * 
 * @author Eric Honsey
 *
 */
public class p0008 {
	
	public static void main(String[] args) throws IOException {
		String fileName = "input-files/Number-p0008.txt";
		FileInputStream fis = new FileInputStream(new File(fileName));
		Scanner sc = new Scanner(fis);
		
		String grid = "";
		while (sc.hasNext()) {
			grid += sc.next();
		}
		
		int n = 5;
		System.out.println(largestProduct(grid, n));
	}
	
	public static int largestProduct(String grid, int n) {
		int stop = grid.length() - n;
		int result = 0;
		
		for (int i = 0; i <= stop; i++) {
			int product = 1;
			for (int j = i; j < i + n; j++) {
				char a = grid.charAt(j);
				product *= Character.getNumericValue(a);
			}
			result = Math.max(result, product);
		}
		
		return result;
	}

}
