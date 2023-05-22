import java.util.Scanner;
public class MinMaxExtension {
    // main methods
    public static void main(String[] args) {
        // create scanner object
        Scanner reader = new Scanner(System.in);
        // read user input num1, num2, num3
        System.out.println("This program will read three numbers from you.");
        System.out.println("Enter 3 numbers= "); // instruction for the user
        // read user input as double numbers
        double num1 = reader.nextDouble();
        double num2 = reader.nextDouble();
        double num3 = reader.nextDouble();

        if (num1 % 1 == 0 && num2 % 1 == 0 && num3 % 1 == 0){ // whole numbers, int method call
            //call maxNumber
            System.out.println("The the biggest number is " + maxNum((int)num1, (int)num2, (int)num3));
            //call minNumber
            System.out.println("The the smallest number is " + minNum((int)num1, (int)num2, (int)num3));
        } else { // decimal numbers, double method call
            //call maxNumber
            System.out.println("The the biggest number is " + maxNum(num1, num2, num3));
            //call minNumber
            System.out.println("The the smallest number is " + minNum(num1, num2, num3));
        }



    }// main method ends

    // method 1 to find the biggest number
    public static int maxNum(int a, int b, int c){
        if (a > b && a >c){
            return a; // a is bigger
        } else if (b >a && b >c) {
            return b; // b is bigger
        }else {
            return c;
        }
    } // end of maxNumber method

    // create method 2 to return the minimum number
    public static int minNum (int a, int b, int c){
        if ( a < b && a < c) {
            return a; // a is smallest
        } else if (b < a && b < c ){
            return b; // b is smallest
        } else {
            return c;
        }
    } // end of minNumber method
    // create method 3 to return the max number (double) use method overloading
    public static double maxNum(double a, double b, double c){
        if (a > b && a >c){
            return a; // a is bigger
        } else if (b >a && b >c) {
            return b; // b is bigger
        }else {
            return c;
        }
    } // end of maxNumber method

    // create method 4 to return the min number (double) use method overloading
    public static double minNum (double a, double b, double c){
        if ( a < b && a < c) {
            return a; // a is smallest
        } else if (b < a && b < c ){
            return b; // b is smallest
        } else {
            return c;
        }
    }// end of minNumber method
}
