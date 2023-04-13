import java.util.Scanner;
public class StoreOpen {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Is the store open ? Y or N");
        String response = reader.nextLine();

        if (response.equals("Y") || response.equals("y")) {
            System.out.println("Welcome. We are open from 9.00 am to 9.00 pm today.");
        } else if (response.equals("N") || response.equals("n")) {
            System.out.println("Sorry, we are not open today. Come another day.");
        } else if (response != ("Y") || response.equals("N")) {
            System.out.println("Wrong Response. Only Y or N please");
            // modify this, if the user entered other than Y or N, you will say, Wrong Response. Only Y or N please.
        }
    }
}