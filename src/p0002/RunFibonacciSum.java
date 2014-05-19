package p0002;

public class RunFibonacciSum {

	public static void main(String[] args) {
		int n = 4000000;
		int sum;
		FibonacciGenerator fg = new FibonacciGenerator(n);
		
		// Fills arrayList with fibonacci sequence up to limit
		fg.generateArrayList();
		
		sum = fg.sumEvens();
		
		System.out.println(sum);
	}

}
