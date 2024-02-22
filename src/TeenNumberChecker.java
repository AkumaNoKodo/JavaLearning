/**
 * Checks if any of the given three integers is within the "teen" range of 13 to 19 inclusive.

 * This method accepts three parameters of type int and checks if any one of them falls within
 * the range of 13 to 19 (inclusive). It returns true if at least one of the parameters is a "teen"
 * number, otherwise it returns false.

 * The method is useful for conditions where you need to verify the presence of "teen" numbers
 * in a set of integers.

 * Examples:
 * - hasTeen(9, 99, 19) returns true, because 19 is within the range of 13 to 19.
 * - hasTeen(23, 15, 42) returns true, because 15 is within the range of 13 to 19.
 * - hasTeen(22, 23, 34) returns false, because none of the numbers are within the "teen" range.

 * Note: The method must be defined as public static, consistent with the practices of the course.
 */

/**
 * Determines if a single integer is within the "teen" range of 13 to 19 inclusive.

 * This method accepts one parameter of type int and checks if it falls within the range
 * of 13 to 19 (inclusive). It returns true if the parameter is a "teen" number, otherwise
 * it returns false.

 * This method simplifies checking individual numbers for the "teen" status and is useful
 * for validations or conditions involving age or other criteria tied to this specific range.

 * Examples:
 * - isTeen(9) returns false, because 9 is not within the range of 13 to 19.
 * - isTeen(13) returns true, because 13 is within the range of 13 to 19.

 * Note: The method must be defined as public static, in line with the course conventions.
 */

public class TeenNumberChecker {
    public static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }

    public static boolean hasTeen(int age1, int age2, int age3) {
        return isTeen(age1) || isTeen(age2) || isTeen(age3);
    }
}
