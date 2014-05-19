package p0002;

import java.util.ArrayList;
import math.Functions;

public class FibonacciGenerator {
	
	private int limit;
	ArrayList<Integer> fibonacciList;
	
	public FibonacciGenerator(int limit) {
		this.limit = limit;
	}
	
	public void generateArrayList() {
		fibonacciList = new ArrayList<Integer>();
		
		int current = 1;
		int previous = 0;
		
		while (current <= limit) {
			fibonacciList.add(current);
			int temp = current;
			current += previous;
			previous = temp;
		}
	}
	
	public int sum() {
		int sum = 0;
		
		for (Integer value: fibonacciList) {
				sum += value;
		}
		
		return sum;
	}
	
	public int sumEvens() {
		int sum = 0;
		
		for (Integer value: fibonacciList) {
			if (Functions.isEven(value)) {
				sum += value;
			}
		}
		
		return sum;
	}
	
	public int sumOdds() {
		int sum = 0;
		
		for (Integer value: fibonacciList) {
			if (!Functions.isEven(value)) {
				sum += value;
			}
		}
		
		return sum;
	}

}
