/**
 * Checks if the sum of two integers equals a third integer.

 * This method accepts three parameters of type int. It calculates the sum of the first
 * and second parameter and compares the result to the third parameter. If the sum is equal
 * to the third parameter, the method returns true. Otherwise, it returns false.

 * The method is useful for simple arithmetic checks and validations where you need to
 * verify if the sum of two values matches a specific target value.

 * Examples:
 * - hasEqualSum(1, 1, 1) returns false, because the sum of 1 and 1 is not equal to 1.
 * - hasEqualSum(1, 1, 2) returns true, because the sum of 1 and 1 is equal to 2.
 * - hasEqualSum(1, -1, 0) returns true, because the sum of 1 and -1 is equal to 0.

 * Note: The method must be defined as public static, consistent with the practices of the course.
 */

public class EqualSumChecker {
    public static boolean hasEqualSum(int x, int y, int z) {
        return x + y == z;
    }
}
