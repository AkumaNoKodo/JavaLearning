/**
 * Prints the English word for numbers between 0 and 9, and "OTHER" for all other numbers.

 * This method takes one parameter, number, which is a whole number (int). It translates the number
 * into its corresponding English word if the number is between 0 and 9. For numbers outside this range,
 * including negative numbers, it prints "OTHER".

 * The method can be implemented using either an if-else statement or a switch statement, depending
 * on which is more convenient or understandable for the developer.

 * Parameter:
 * - number: An int that represents the whole number to be translated into its English word equivalent.

 * Examples:
 * - printNumberInWord(0) prints "ZERO".
 * - printNumberInWord(1) prints "ONE".
 * - printNumberInWord(9) prints "NINE".
 * - printNumberInWord(10) prints "OTHER".
 * - printNumberInWord(-1) prints "OTHER".
 */

public class NumberInWord {
    public static void printNumberInWord(int number) {
        String out = switch (number) {
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";
        };

        System.out.println(out);
    }
}
