/**
 * Converts minutes into a format that expresses the equivalent amount of time in years and days.

 * This method accepts a long parameter named minutes, representing an amount of time in minutes.
 * It calculates the equivalent number of years and days that correspond to the given minutes.

 * The conversion follows these rules:
 * - If the parameter is less than 0, the method prints "Invalid Value" to indicate an invalid input.
 * - Otherwise, it prints the conversion result in the format "XX min = YY y and ZZ d", where:
 *   - XX represents the original minutes value.
 *   - YY represents the calculated years.
 *   - ZZ represents the remaining days after converting to years.

 * The calculation uses the following time conversion rates:
 * - 1 hour = 60 minutes
 * - 1 day = 24 hours
 * - 1 year = 365 days

 * Examples:
 * - printYearsAndDays(525600) prints "525600 min = 1 y and 0 d".
 * - printYearsAndDays(1051200) prints "1051200 min = 2 y and 0 d".
 * - printYearsAndDays(561600) prints "561600 min = 1 y and 25 d".

 * Note: The method must be defined as public static, consistent with the course's conventions. Care must be taken
 * to avoid extra spaces in the printed message for correct output formatting.
 */

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long minutesInYear = 365 * 24 * 60;
        long years = minutes / minutesInYear;
        long days = minutes % minutesInYear / 24 / 60;

        System.out.printf("%d min = %d y and %d d\n", minutes, years, days);
    }
}
