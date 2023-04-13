import java.util.Scanner;
public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("type a number: ");
        double num = reader.nextInt();

        if (num < 1 && num !=0){
            System.out.println("Your number is negative");
        } else if (num == 0) {
            System.out.println("Zero is not even or odd number");
        } else if (num % 2 == 0){
            System.out.println("Your number is even.");
        } else if (num % 2 !=0 && num < 0) {
            System.out.println("Your can not be divide.");
        }
    }
}
