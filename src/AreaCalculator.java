/**
 * Calculates the area of a circle given the radius.

 * This method accepts a single double parameter named radius representing the radius of the circle.
 * It returns the area of the circle as a double. If the radius is negative, the method returns -1.0,
 * indicating an invalid value.

 * The area of a circle is calculated using the formula: area = PI * radius * radius.
 * PI is a constant value approximately equal to 3.14159.

 * Examples:
 * - area(5.0) should return 78.53981633974483 (or a rounded value thereof).
 * - area(-1) should return -1.0, indicating an invalid input.

 * Note: The method must be defined as public static, following the conventions of the course.
 */

/**
 * Calculates the area of a rectangle given the lengths of its sides.

 * This method is overloaded to accept two double parameters, x and y, representing the lengths
 * of the sides of the rectangle. It returns the area of the rectangle as a double. If either x or y
 * is negative, the method returns -1.0 to indicate an invalid value.

 * The area of a rectangle is calculated using the formula: area = x * y.

 * Examples:
 * - area(5.0, 4.0) should return 20.0.
 * - area(-1.0, 4.0) should return -1.0, indicating that the first parameter is invalid.
 */

public class AreaCalculator {
    public static double area(double radius) {
        return radius < 0 ? -1 : Math.PI * Math.pow(radius, 2);
    }

    public static double area(double a, double b) {
        return a < 0 || b < 0 ? -1 : a * b;
    }
}
