package math;

import java.util.ArrayList;

public class FibonacciGenerator {
	
	private int limit;
	
	public FibonacciGenerator(int limit) {
		this.limit = limit;
	}
	
	public ArrayList<Integer> getArrayList() {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		int current = 1;
		int previous = 0;
		
		while (current <= limit) {
			arrayList.add(current);
			int temp = current;
			current += previous;
			previous = temp;
		}
		
		return arrayList;
	}

}
