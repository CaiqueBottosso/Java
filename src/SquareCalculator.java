public class SquareCalculator {
    public static void main(String[] args) {
        float width = 13.5f;
        float height = 25.3f;
        double perimeter = 2*(width+height);
        double area = width*height;
        System.out.println("width: " + width + " and the height is: " + height );
        System.out.println("The perimeter is: " + perimeter);
        System.out.println("The area is: " + area);
    }
}
