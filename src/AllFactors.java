/**
 * Prints all factors of the given number.

 * This method takes an int parameter named number and prints all factors of that number.
 * A factor is defined as an integer that divides the number wholly, leaving no remainder.
 * If the number is less than 1, the method prints "Invalid Value" to indicate invalid input.

 * The method iterates through all integers from 1 up to and including the number itself,
 * checking for divisibility. For each integer that divides the number without leaving a remainder,
 * that integer is printed as a factor.

 * Examples:
 * - printFactors(6) prints:
 * 1 2 3 6

 * - printFactors(32) prints:
 * 1 2 4 8 16

 * - printFactors(10) prints:
 * 1 2 5 10

 * - printFactors(-1) prints "Invalid Value", as the number is less than 1.

 * Hint: A while or for loop can be used to implement the factor-finding logic.
 */

public class AllFactors {
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }

        System.out.print("1");
        for (int i = 2; i < number; i++) {
            if (number % i == 0) System.out.print(" " + i);
        }
        if (number != 1) System.out.print(" " + number);
    }
}
