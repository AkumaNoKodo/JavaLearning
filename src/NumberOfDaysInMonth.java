/**
 * Calculates the number of days in a given month and year, taking into account leap years.

 * This method accepts two parameters: month and year, both of type int. The month parameter
 * represents the month number (1 for January, 2 for February, etc.), and the year parameter
 * represents the year.

 * If the month parameter is less than 1 or greater than 12, or if the year parameter is less
 * than 1 or greater than 9999, the method returns -1 to indicate an invalid value. Otherwise,
 * it returns the number of days in the specified month, accounting for leap years in February.

 * The method utilizes the isLeapYear method to determine if the given year is a leap year when
 * calculating the days in February.

 * Examples:
 * - getDaysInMonth(1, 2020) returns 31, as January has 31 days.
 * - getDaysInMonth(2, 2020) returns 29, as February has 29 days in a leap year, and 2020 is a leap year.
 * - getDaysInMonth(2, 2018) returns 28, as February has 28 days in a non-leap year, and 2018 is not a leap year.
 * - getDaysInMonth(-1, 2020) returns -1, as the month parameter is invalid.
 * - getDaysInMonth(1, -2020) returns -1, as the year parameter is outside the valid range.

 * Hint: Use a switch statement to handle different months.
 */

public class NumberOfDaysInMonth {
    public static int getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9999) return -1;

        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> LeapYearCalculator.isLeapYear(year) ? 29 : 28;
            default -> -1;
            };
    }
}
