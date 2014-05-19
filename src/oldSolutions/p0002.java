package oldSolutions;
import java.util.ArrayList;

import math.FibonacciGenerator;
import math.Functions;

/**
 * Implements a solution to Problem 2 on projecteuler.net
 * http://projecteuler.net/problem=2
 * 
 * By considering the terms in the Fibonacci sequence whose
 * values do not exceed four million, find the sum of the
 * even-valued terms.
 * 
 * @author Eric Honsey
 *
 */
public class p0002 {
	
	public static void main(String[] args) {
		int n = 4000000;
		int sum = 0;
		
		FibonacciGenerator fg = new FibonacciGenerator(n);
		ArrayList<Integer> fibonacci = fg.getArrayList();
		
		for (Integer value: fibonacci) {
			if (Functions.isEven(value)) {
				sum += value;
			}
		}
		
		System.out.println(sum);
	}

}
