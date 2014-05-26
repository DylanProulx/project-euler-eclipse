package p0002;

public class RunFibonacciSum {

	public static void main(String[] args) {
		FibonacciGenerator fg = new FibonacciGenerator();
		
		// Fills arrayList with fibonacci sequence up to limit
        int limit = 4000000;
        fg.generateArrayList(limit);

        int sum;
		sum = fg.sumEvens();
		
		System.out.println(sum);
	}

}
