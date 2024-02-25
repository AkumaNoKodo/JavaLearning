/**
 * Checks if two numbers have at least one shared digit.

 * This method accepts two int parameters, each supposed to be within the range of 10 to 99 (inclusive).
 * It returns true if there is at least one digit that appears in both numbers, and false otherwise.
 * If either of the numbers is outside the 10 to 99 range, the method immediately returns false to indicate
 * that at least one of the numbers is not within the valid range.

 * The method examines each digit of both numbers to determine if they share a common digit. This involves
 * breaking down each number into its individual digits and comparing those digits to see if any match.

 * Examples:
 * - hasSharedDigit(12, 23) returns true, since the digit 2 appears in both numbers.
 * - hasSharedDigit(9, 99) returns false, since 9 is outside the valid range of 10 to 99.
 * - hasSharedDigit(15, 55) returns true, since the digit 5 appears in both numbers.
 */

public class SharedDigit {
    public  static boolean hasSharedDigit(int a, int b) {
        if (a < 10 || a > 99 || b < 10 || b > 99) return false;

        int last_digit_x;
        for (int temp_a = a; temp_a != 0; temp_a /= 10) {
            last_digit_x = temp_a % 10;

            for (int temp_b = b; temp_b != 0; temp_b /= 10) {
                if (last_digit_x == temp_b % 10) return true;
            }
        }
        return false;
    }
}
