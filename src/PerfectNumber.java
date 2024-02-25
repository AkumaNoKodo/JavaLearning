/**
 * Determines if a number is a perfect number.

 * A perfect number is a positive integer that is equal to the sum of its proper positive divisors,
 * excluding itself. This method takes an int parameter named number and returns a boolean. It returns
 * true if the number is a perfect number, and false otherwise. If the number is less than 1, the method
 * immediately returns false to indicate an invalid value.

 * The method calculates the sum of all proper divisors of the number and compares this sum to the number
 * itself. Proper divisors are those numbers less than the given number which divide evenly into the number.

 * Examples:
 * - isPerfectNumber(6) returns true, as 1 + 2 + 3 = 6.
 * - isPerfectNumber(28) returns true, as 1 + 2 + 4 + 7 + 14 = 28.
 * - isPerfectNumber(5) returns false, as its only proper divisor is 1, and 1 does not equal 5.
 * - isPerfectNumber(-1) returns false, as the number is less than 1.
 */

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;

        int sum = 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) sum += i;
        }
        return  sum == number;
    }
}
