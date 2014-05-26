package p0003;

public class LargestPrimeFactor {
	
	public long getLargestFactor(long number) {
		long factor;
		
		for (factor = 2; factor <= number; factor++) {
			if (number % factor == 0) {
				number /= factor;
				factor--;
			}
		}
		
		return factor;
	}

}
