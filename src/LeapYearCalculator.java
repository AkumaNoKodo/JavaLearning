/**
 * Determines whether a specified year is a leap year.
 * This method accepts an int parameter named year. The year must be greater than or equal to 1
 * and less than or equal to 9999. If the year is not within this range, the method returns false.
 * The criteria for determining a leap year are as follows:
 * 1. A year is a leap year if it is evenly divisible by 4 but not by 100,
 *    unless it is also evenly divisible by 400.
 *    - If the year is divisible by 4, proceed to the next check.
 *    - If the year is divisible by 100, it must also be divisible by 400 to be a leap year.
 * 2. If the year passes these checks, it is a leap year, and the method returns true.
 * 3. If the year fails any of these checks, it is not a leap year, and the method returns false.
 * Examples:
 * - isLeapYear(-1600) returns false, as the year is not in the range of 1 to 9999.
 * - isLeapYear(1600) returns true, as 1600 is divisible by 4, 100, and 400.
 * - isLeapYear(2017) returns false, as 2017 is not divisible by 4.
 * - isLeapYear(2000) returns true, as 2000 is divisible by 4, 100, and 400.
 */

public class LeapYearCalculator {
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) && year >= 1 && year <= 9999 ;
    }
}
