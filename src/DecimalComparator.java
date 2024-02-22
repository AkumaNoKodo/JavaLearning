/**
 * Compares two double values up to three decimal places.
 * This method accepts two parameters of type double. It checks if the two numbers are the same
 * up to three decimal places. The comparison ignores differences beyond the third decimal place.
 * To perform this comparison, the method:
 * - Multiplies each number by 1000 and casts the result to an int. This truncates the number
 *   to three decimal places.
 * - Compares the resulting int values for equality.
 * If the numbers are equal up to three decimal places, the method returns true. Otherwise, it returns false.
 * Examples:
 * - areEqualByThreeDecimalPlaces(-3.1756, -3.175) returns true.
 * - areEqualByThreeDecimalPlaces(3.175, 3.176) returns false.
 * - areEqualByThreeDecimalPlaces(3.0, 3.0) returns true.
 * - areEqualByThreeDecimalPlaces(-3.123, 3.123) returns false.
 * Notes:
 * - The method should be used to precisely compare values up to three decimal places.
 */
public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        return (int) (firstNumber * 1000) == (int) (secondNumber * 1000);
    }
}
