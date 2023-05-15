import java.util.Random;

public class Duplicates {
    public static void main(String[] args) {
        // create and initialize the arrays
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            array1[i] = rand.nextInt(20) + 1;
            array2[i] = rand.nextInt(20) + 1;
        }

        // print out the arrays
        System.out.println("\nArray 1:");
        for (int i = 0; i < 10; i++) {
            System.out.println(array1[i]);
        }

        System.out.println("\nArray 2:");
        for (int i = 0; i < 10; i++) {
            System.out.println(array2[i]);
        }

        // find and print any duplicated values
        System.out.println("\nDuplicated values:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i != j && array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                }
            }
        }
    }
}
