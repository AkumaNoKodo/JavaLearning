/**
 * Determines if the cat is playing based on the temperature and whether it is summer.

 * This method checks if the cat is playing under two conditions based on the temperature:
 * - During summer (when the first parameter, summer, is true), the cat plays if the temperature
 *   is between 25 and 45 degrees inclusive.
 * - During other seasons (when summer is false), the cat plays if the temperature is between
 *   25 and 35 degrees inclusive.

 * Parameters:
 * - summer: A boolean indicating if it is currently summer.
 * - temperature: An int representing the current temperature.

 * The method returns true if the cat is playing under the given conditions, otherwise false.

 * Examples:
 * - isCatPlaying(true, 10) returns false since the temperature is not in the range 25 - 45.
 * - isCatPlaying(false, 36) returns false since the temperature is not in the range 25 - 35
 *   (assuming it's not summer).
 * - isCatPlaying(false, 35) returns true since the temperature is within the range 25 - 35.

 * Note: The method must be defined as public static, consistent with the course's conventions.
 */

public class PlayingCat {
    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        return isSummer ? temperature >= 25 && temperature <= 45 : temperature >= 25 && temperature <= 35;
    }
}
