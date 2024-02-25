/**
 * Calculates the greatest common divisor (GCD) of two given numbers.

 * This method accepts two int parameters, named first and second, and returns the greatest common divisor
 * of these numbers. The GCD is the largest positive integer that fully divides each of the integers without
 * leaving a remainder. If either of the parameters is less than 10, the method returns -1 to indicate
 * an invalid value.

 * The method employs a loop to find the GCD by checking each integer from 1 up to the minimum of the two
 * numbers. The highest number that divides both parameters without leaving a remainder is the GCD.

 * Examples:
 * - getGreatestCommonDivisor(25, 15) returns 5, as both numbers can be divided by 5 without a remainder.
 * - getGreatestCommonDivisor(12, 30) returns 6, as both numbers can be divided by 6 without a remainder.
 * - getGreatestCommonDivisor(9, 18) returns -1, as the first parameter is less than 10.
 * - getGreatestCommonDivisor(81, 153) returns 9, as both numbers can be divided by 9 without a remainder.
 */

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int a, int b) {
        if (a < 10 || b < 10) return -1;

        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
