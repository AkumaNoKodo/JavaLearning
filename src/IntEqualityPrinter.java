/**
 * Prints a message based on the equality or difference of three integer parameters.

 * This method accepts three int parameters and evaluates their values to print specific messages:
 * - If any of the parameters is less than 0, it prints "Invalid Value" to indicate an invalid input.
 * - If all three numbers are equal, it prints "All numbers are equal".
 * - If all three numbers are different, it prints "All numbers are different".
 * - If neither of the above conditions is true (i.e., not all are equal but not all are different either),
 *   it prints "Neither all are equal or different".

 * This method is useful for comparing three integers to understand their relationship in terms of equality
 * or difference, providing a clear textual response for each scenario.

 * Examples:
 * - printEqual(1, 1, 1) prints "All numbers are equal".
 * - printEqual(1, 1, 2) prints "Neither all are equal or different".
 * - printEqual(-1, -1, -1) prints "Invalid Value".
 * - printEqual(1, 2, 3) prints "All numbers are different".
 */

public class IntEqualityPrinter {
    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
        }else if (a == b && a == c) {
            System.out.println("All numbers are equal");
        }else if (a != b && a != c && b != c) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
