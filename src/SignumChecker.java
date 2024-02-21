/**
 * Method for checking if a number is positive, negative, or zero.
 * This method accepts a single int parameter named number.
 * Based on the value of this parameter, the method will print:
 *   - "positive" if the parameter number is greater than 0.
 *   - "negative" if the parameter number is less than 0.
 *   - "zero" if the parameter number is equal to 0.
 * Note: The checkNumber method must be defined as public static.
 */
public class SignumChecker {
    public static void checkNumber(int number) {
        String result = "zero";

        if (number > 0){
            result = "positive";
        } else if (number < 0) {
            result = "negative";
        }

        System.out.println("Number is " + result + ".");
    }

}
