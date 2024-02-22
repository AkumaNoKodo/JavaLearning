/**
 * Determines if we need to wake up based on the dog barking and the hour of the day.
 * This method takes two parameters:
 * - A boolean named barking that indicates if the dog is currently barking.
 * - An int named hourOfDay that represents the hour of the day, with a valid range of 0-23.
 * The method returns true if we need to wake up, which is the case if the dog is barking
 * before 8 or after 22 hours. Under all other conditions, it returns false.
 * Additionally, if the hourOfDay parameter is less than 0 or greater than 23, the method
 * will return false, indicating invalid input hours.
 * Examples of input/output:
 * - shouldWakeUp(true, 1) returns true.
 * - shouldWakeUp(false, 2) returns false since the dog is not barking.
 * - shouldWakeUp(true, 8) returns false, as it is not before 8.
 * - shouldWakeUp(true, -1) returns false since the hourOfDay parameter is out of the valid range.
 * Tip: Use the if-else statement with multiple conditions to implement this logic.
 * Note: The shouldWakeUp method must be defined as public static, in line with the practices of the course.
 */

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        return barking && ((hourOfDay < 8 && hourOfDay >= 0) || (hourOfDay == 23));
    }
}
