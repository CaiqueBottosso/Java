// 1. import java scanner
import java.util.Scanner;
public class ExistInArray {
    public static void main(String[] args) {
        //2.  create scanner object
        Scanner sc = new Scanner(System.in);
        //3. create array of 5 integer values
        int[] numbers = {22, 110, 18, 45, 6};
        //4. ask user to guess your number
        System.out.println("Please guess a number");
        //5. read user guess as int guess
        int searchValue = sc.nextInt();
        // 6. declare a boolean variable, set as False
        boolean isFound = false;
        // 7.a. use for loop to access the array elements
        // 7.b. use if statement, if guess number equals to numbers[i]
        // change the value of boolean variable to True
        for (int index=0; index < numbers.length; index++) {
            if (searchValue == numbers[index]) {
                //update boolean var to true
                isFound = true;
            }
        }
        //System.out.println( "Can you find the number inside the array? " + isFound);
        // 8. outside the loop create if-else statement to print
        if (isFound == true) {
            System.out.println("Value " + searchValue + " is found in array");
        } else {
            System.out.println("Value " + searchValue + " was not found in array");
        }

        // if  the value exists, output “Value X found in array” otherwise, output “Value was not found in array”.
    }
}

