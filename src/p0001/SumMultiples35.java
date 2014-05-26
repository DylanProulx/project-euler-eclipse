package p0001;

public class SumMultiples35 {

	public int getSum(int limit) {
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
