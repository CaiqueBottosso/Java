public class SumAvgArray {
    public static void main(String[] args) {
        int sum = 0;
        int[] number = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < number.length; i++){   //printing using loop
            System.out.println(number[i] + " ");
            sum = sum + number[i];
        }
        double average = (double)sum / number.length; //type casting
        System.out.println("Sum of number is: " + sum);
        System.out.println("The average is : " + average);
    }
}
