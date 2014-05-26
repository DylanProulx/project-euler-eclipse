package p0005;

import math.PrimeNumbersGenerator;
import math.Booleans;
import java.util.ArrayList;

/**
 * Created by Eric on 5/26/2014.
 */
public class SmallestMultiple {

    public int getSmallestMultiple(int smallest, int largest) {
        ArrayList<Integer> divisors = new ArrayList<Integer>();
        for (int index = smallest; index <= largest; index++) {
            divisors.add(index);
        }

        int n = 0;
        boolean divisible = false;

        while (!divisible) {
            n++;
            if (Booleans.isDivisibleByRange(n, divisors)) {
                divisible = true;
            }
        }

        return n;
    }
}
