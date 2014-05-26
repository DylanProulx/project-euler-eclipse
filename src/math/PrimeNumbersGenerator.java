package math;

import java.util.ArrayList;

/**
 * Created by Eric on 5/26/2014.
 */
public class PrimeNumbersGenerator {

    public ArrayList<Integer> runPrimesSieve(int limit) {;
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

        boolean[] numberList = new boolean[limit + 1];

        for (int index = 2; index <= limit; index++) {
            numberList[index] = true;
        }

        for (int index = 2; index <= limit; index++) {
            if (numberList[index] == true) {
                primeNumbers.add(index);
                for (int multiple = index * 2; multiple <= limit; multiple += index) {
                    numberList[multiple] = false;
                }
            }
        }

        return primeNumbers;
    }

}
