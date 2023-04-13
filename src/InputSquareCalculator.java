import java.sql.SQLOutput;
import java.util.Scanner;
public class InputSquareCalculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your width: ");
        float widthUser = reader.nextFloat();
        System.out.println("Enter your height: ");
        float heightUser = reader.nextFloat();
        double perimeter = 2*(widthUser+heightUser);
        double area = widthUser*heightUser;
        System.out.println("width: " + widthUser + " and the height is: " + heightUser );
        System.out.println("The perimeter is: " + perimeter);
        System.out.println("The area is: " + area);
    }
}
