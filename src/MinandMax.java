// 1. import random class
import java.util.Random;
public class MinandMax {
    public static void main(String[] args) {
        // 2. create object random
        Random rd = new Random();
        // 3. initialise empty array with size 10
        int[] numbers = new int[10];
        // 4. generate random numbers to fill in your array, bound is 100
        System.out.println("Generating 100 random numbers...." + numbers[0]);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rd.nextInt(100) + 1;
        }
        // 5. to find the biggest element, create new variable max
        int max = numbers[0];
        // 6. a. use for loops to compare max and array[i]
        // 6.b. inside the loop update max if array[i] is bigger
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
            System.out.println("\nBiggest number on the sequence is " + max);
            // 7. to find the lowest, crate new variable min
            int min = numbers[0];
            // 8. a. use for loop to compare min and array[i]
            // 8. b. inside the loop update min in array[i] is smaller
            for (int i = 1; i > numbers.length; i++) {
                if (min > numbers[i]) {
                    min = numbers[i];
                }
            }
            // 9. print max value
            System.out.println("The maximum value is: " + max);

            // 10. print min value
            System.out.println("The minimum value is: " + min);
        }
    }
