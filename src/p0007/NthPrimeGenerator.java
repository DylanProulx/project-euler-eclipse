package p0007;

import math.PrimeNumbersGenerator;

import java.util.ArrayList;

/**
 * Created by Eric on 5/26/2014.
 */
public class NthPrimeGenerator {

    public int getNthPrime(int n) {
        PrimeNumbersGenerator getPrimes = new PrimeNumbersGenerator();
        ArrayList<Integer> primesList = getPrimes.runPrimesSieve(2000000);

        return primesList.get(n - 1);
    }

}
