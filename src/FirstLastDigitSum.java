/**
 * Calculates the sum of the first and the last digit of a given number.

 * This method takes one parameter of type int named number and returns the sum of the number's first
 * and last digit. If the number is negative, the method returns -1, indicating an invalid value.

 * The method uses a loop to isolate the first digit. It does this by continuously dividing the number
 * by 10 until it becomes a single-digit number, which is the first digit. The last digit is found by
 * taking the remainder of the number when divided by 10. If the number is a single digit, that digit
 * is considered both the first and the last digit, and its double is returned as the sum.

 * Examples:
 * - sumFirstAndLastDigit(252) returns 4, since the first and last digits are both 2.
 * - sumFirstAndLastDigit(257) returns 9, since the first digit is 2 and the last is 7.
 * - sumFirstAndLastDigit(0) returns 0, since there is only one digit, 0.
 * - sumFirstAndLastDigit(5) returns 10, since the first and last digit is 5.
 * - sumFirstAndLastDigit(-10) returns -1, indicating invalid input.

 * Note: This method must be defined as public static, consistent with the course's conventions.
 */

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;

        int lastDigit = number % 10;
        int firstDigit = number;

        while (firstDigit >= 10) firstDigit /= 10;

        return firstDigit + lastDigit;
    }
}
