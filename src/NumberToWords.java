/**
 * Converts a number into its word representation.

 * This method takes an int parameter named number and prints the number using words for the digits.
 * If the number is negative, "Invalid Value" is printed. The method handles leading zeroes by ensuring
 * that numbers like 100 print as "One Zero Zero" through the use of the getDigitCount and reverse methods.

 * The method extracts each digit from the end of the number, converts it to its word form, and prints it.
 * It uses the reverse method to reverse the number first to ensure digits are printed in the correct order.
 * The getDigitCount method is used to handle leading zeroes in the reversed number.

 * Example usage:
 * - numberToWords(123) prints "One Two Three".
 * - numberToWords(1010) prints "One Zero One Zero".
 * - numberToWords(1000) prints "One Zero Zero Zero".
 * - numberToWords(-12) prints "Invalid Value".

 * Reverses the given number.

 * This method takes an int parameter and returns the reversed number. Negative numbers are reversed with
 * their sign intact. The method iterates through the given number, extracting and appending each digit to
 * the reversed number.

 * Example usage:
 * - reverse(-121) returns -121.
 * - reverse(1212) returns 2121.
 * - reverse(1234) returns 4321.
 * - reverse(100) returns 1.

 * Calculates the digit count of a number.

 * This method takes an int parameter named number and returns the count of digits in that number. If the
 * number is negative, it returns -1 to indicate an invalid value. The method counts the digits by repeatedly
 * dividing the number by 10 until it reaches 0.

 * Example usage:
 * - getDigitCount(0) returns 1.
 * - getDigitCount(123) returns 3.
 * - getDigitCount(-12) returns -1.
 * - getDigitCount(5200) returns 4.
 */

public class NumberToWords {
    public static int getDigitCount(int number) {
        return (number < 0) ? -1 : String.valueOf(number).length();
    }
    public static int reverse(int number) {
        int multiplication = (number < 0) ? -1 : 1;
        number *= multiplication;

        while (number % 10 == 0) {
            number /= 10;
        }

        String string_number = new StringBuilder(String.valueOf(number)).reverse().toString();

        return Integer.parseInt(string_number) * multiplication;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        String out = "";
        do {
            int remainder = number % 10;
            number /= 10;

            String actual_digit = switch (remainder) {
                case 0 -> "Zero";
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";
                default -> "Invalid Value";
            };
            out = "%s %s".formatted(actual_digit, out);

        } while (number != 0) ;

        System.out.println(out);
    }
}
