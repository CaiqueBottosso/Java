import java.util.Scanner;
public class TimesTable {
    public static void main(String[] args) {
        // create scanner object
        Scanner reader = new Scanner(System.in);
        // ask user to enter int number
        System.out.println("Type a number: ");
        // save this to a variable called answer, read this as integer
        int answer = reader.nextInt();
        // use for loop to display number from 1 to 12
        for(int x=1; x < 13; x++)  {
            System.out.println(answer+" * "+x+" = "+answer*x);
        }

    }
}
