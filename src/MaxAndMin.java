import java.util.Random;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rd = new Random();
        System.out.println(numbers);
        // Fill the array with random values
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rd.nextInt(10) + 1;
        }

        // Find the maximum and minimum values in the array
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // Output the maximum and minimum values
        System.out.println("The maximum value is: " + max);
        System.out.println("The minimum value is: " + min);
    }
}
