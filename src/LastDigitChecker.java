/**
 * Checks if at least two of three given numbers share the same rightmost digit.

 * This method accepts three int parameters, each of which should be within the range of 10 to 1000 (inclusive).
 * It returns true if at least two of the numbers have the same last digit, and false otherwise.
 * If any of the numbers is outside the specified range, the method returns false to indicate invalid input.

 * The method first checks each number's validity by ensuring it falls within the valid range. Then, it
 * compares the last digit of each number to determine if at least two numbers share the same last digit.

 * Examples:
 * - hasSameLastDigit(41, 22, 71) returns true, as 1 is the rightmost digit in 41 and 71.
 * - hasSameLastDigit(23, 32, 42) returns true, as 2 is the rightmost digit in 32 and 42.
 * - hasSameLastDigit(9, 99, 999) returns false, as 9 is outside the range of 10 to 1000.
 */

/**
 * Validates if a number is within the specified range of 10 to 1000 (inclusive).

 * This method takes one int parameter and checks whether the number is within the valid range
 * of 10 to 1000, inclusive. It returns true if the number falls within this range, and false otherwise.

 * This method is used to validate the input for other methods that require numbers within this specific range.

 * Examples:
 * - isValid(10) returns true, as 10 is within the range of 10 to 1000.
 * - isValid(468) returns true, as 468 is within the range of 10 to 1000.
 * - isValid(1051) returns false, as 1051 is outside the range of 10 to 1000.
 */

public class LastDigitChecker {
    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
    public static boolean hasSameLastDigit(int a, int b, int c) {
        return (isValid(a) && isValid(b) && isValid(c)) &&
               ((a % 10 == b % 10) ||  (a % 10 == c % 10) || (b % 10 == c % 10));
    }
}
