package p0001;

public class SumMultiples35 {
	
	private int limit;
	
	public SumMultiples35(int limit) {
		this.limit = limit;
	}
	
	public int getSum() {
		int sum = 0;

		for (int num = 3; num < limit; num++) {
			if (num % 3 == 0) {
				sum += num;
			} else if (num % 5 == 0 && num % 3 != 0) {
				sum += num;
			}
		}

		return sum;
	}

}
