package math;

public class Booleans {
	
	// Checks if number is even and returns true or false
	public static boolean isEven(int n) {
		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

    // Checks if a string reads the same forwards and backwards
    public static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    // Checks if an integer is a prime number
    public static boolean isPrime

    //Checks if an integer is divisble by the specified range (smallest, largest)
    public static boolean isDivisibleByRange(int smallest, int largest) {

    }

}
