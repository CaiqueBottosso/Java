public class CircleCalculator {
    public static void main(String[] args) {
        // 1. declare variable called circleRadius, assign value of 12.0
        double circleRadius = 12.0;
        // 2. print the circleRadius
        System.out.println("The radius is: " + circleRadius);
        // 3. Create variable circleDiameter, calculate using 2 * circleRadius
        double circleDiameter = 2*circleRadius;
        // 4. Print variable circleDiameter, e.g "The circle diameter  is " + circleDiameter
        System.out.println("The diameter is: " + circleDiameter);
        // 5. Create variable circleCircumference, calculate using 2 * 3.14 * circleRadius
        double circleCircumference = 2*3.14*circleRadius;
        // 6. Print variable circleCircumference
        System.out.println("The circumference is: " + circleCircumference);
        // 7. Create variable circleArea, calculate using  3.14 * circleRadius * circleRadius
        double circleArea = 3.14*circleRadius*circleRadius;
        System.out.println("The area of the circle is: " + circleArea);

    }
}