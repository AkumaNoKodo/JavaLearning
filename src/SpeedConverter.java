/**
 * Converts kilometers per hour to miles per hour.
 * This method accepts a double parameter named kilometersPerHour and returns a long.
 * If kilometersPerHour is less than 0, the method returns -1 to indicate an invalid value.
 * Otherwise, it calculates the miles per hour, rounds the result, and returns it.
 * Conversion formula: 1 mile per hour = 1.609 kilometers per hour.
 * Examples:
 * toMilesPerHour(1.5) returns 1
 * toMilesPerHour(10.25) returns 6
 * toMilesPerHour(-5.6) returns -1
 * toMilesPerHour(25.42) returns 16
 * toMilesPerHour(75.114) returns 47
 * Note: Use Math.round for rounding. The method should be defined as public static.
 * Prints the conversion from kilometers per hour to miles per hour.
 * This method accepts a double parameter named kilometersPerHour and does not return anything.
 * It calculates milesPerHour using the toMilesPerHour method and prints a message in the format:
 * "XX km/h = YY mi/h", where XX is the original value and YY is the rounded miles per hour.
 * If kilometersPerHour is less than 0, it prints "Invalid Value".
 * Examples:
 * printConversion(1.5) prints "1.5 km/h = 1 mi/h"
 * printConversion(10.25) prints "10.25 km/h = 6 mi/h"
 * printConversion(-5.6) prints "Invalid Value"
 * printConversion(25.42) prints "25.42 km/h = 16 mi/h"
 * printConversion(75.114) prints "75.114 km/h = 47 mi/h"
 * Note: The method should be defined as public static. Do not duplicate code; call toMilesPerHour.
 */

public class SpeedConverter {
        public static long toMilesPerHour(double kilometersPerHour) {
                if (kilometersPerHour < 0) {
                        return -1;
                }

                return Math.round(kilometersPerHour / 1.609);
        }

        public static void printConversion(double kilometersPerHour) {
                long milesPerHour = SpeedConverter.toMilesPerHour(kilometersPerHour);

                System.out.println(
                        milesPerHour == -1 ? "Invalid Value" : kilometersPerHour + " km/h = " + milesPerHour + " mi/h"
                );
        }
}
