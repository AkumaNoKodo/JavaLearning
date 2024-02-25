/**
 * Determines if a given number is a palindrome.

 * A palindrome number is a number that remains the same when its digits are reversed. This method
 * takes an int parameter called number and returns a boolean. It returns true if the number is a
 * palindrome, and false otherwise.

 * The method handles both positive and negative numbers, as negative numbers can also be palindromes
 * when their sign is disregarded. The reverse of the given number is calculated, and this reversed number
 * is compared to the original number to determine if it is a palindrome.

 * Steps to check for a palindrome:
 * - Reverse the given number.
 * - Compare the reversed number with the original number.

 * Logic to reverse a number:
 * - Initialize a variable to store the reverse of the number.
 * - Extract the last digit of the number using modulo division.
 * - Add the last digit to the reverse variable, increasing its place value accordingly.
 * - Remove the last digit from the original number by dividing it by 10.
 * - Repeat the steps until the original number is reduced to zero.

 * Examples:
 * - isPalindrome(-1221) returns true.
 * - isPalindrome(707) returns true.
 * - isPalindrome(11212) returns false, as its reverse is 21211, which is not equal to the original number.
 */

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        String string_number = Integer.toString(Math.abs(number));
        StringBuilder revers_string_number = new StringBuilder(string_number).reverse();

        return string_number.contentEquals(revers_string_number);
    }
}
