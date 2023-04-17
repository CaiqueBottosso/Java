// Import scanner
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        System.out.println("--This program will reverse any word!--");
        // create scanner object
        Scanner sc = new Scanner(System.in);
        // read user input as char (use char[] letters = reader.nextLine().toCharArray(); )
        System.out.println("Enter any word to reverse : ");
        char[] letters = sc.nextLine().toCharArray();
        // start with printing all letters using for loop or for each loop
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i] + " ");
        }
        // then print the letters in reverse, hint: start your counter from array.length to index 0, decrementing by 1
        System.out.println("\nThe word in reverse: ");
        for (int i=letters.length-1 ; i >= 0 ; i--) {
            System.out.print(letters[i] + " ");
        }
    }
}
