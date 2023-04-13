import java.util.Scanner;
public class OrOperator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("What is your favorite shoe color ?");
        String response = reader.nextLine();

        if(response.equals("brown") || response.equals("black") || (response.equals("Brown") || response.equals("Black"))){
            System.out.println("YES!");
        }
        else{
            System.out.println("No");
        }
    }
}
