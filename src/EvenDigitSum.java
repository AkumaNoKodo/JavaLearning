/**
 * Calculates the sum of the even digits within a given number.

 * This method accepts an int parameter named number and returns the sum of its even digits.
 * If the number is negative, the method returns -1 to indicate an invalid value.

 * The method iterates through each digit of the number by repeatedly dividing the number by 10
 * and taking the remainder (the last digit) to check if it's even. If a digit is even, it's added
 * to the sum. This process continues until all digits have been processed.

 * Examples:
 * - getEvenDigitSum(123456789) returns 20, since the even digits (2, 4, 6, 8) sum up to 20.
 * - getEvenDigitSum(252) returns 4, since the even digits (2, 2) sum up to 4.
 * - getEvenDigitSum(-22) returns -1, indicating invalid input due to the negative number.

 * Note: This method must be defined as public static, consistent with the conventions of the course.
 */

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;

        int sum = 0;
        int remainder;

        while (number != 0) {
            remainder = number % 10;
            number /= 10;
            if (remainder % 2 == 0) sum += remainder;
        }

        return sum;
    }
}
