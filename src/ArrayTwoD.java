public class ArrayTwoD {
    public static void main (String [] args){
        //Multidimensional array =  multiple rows and multiple cols
        String [][] myArray = {{"Harry", "Ron", "Hermione"},
                {"Potter", "Weasley", "Granger"}};
        // printing multiD array
        System.out.println(myArray[0][0]);
        System.out.println(myArray[0][1]);
        // print the rest of the data
        System.out.println(myArray[0][2]);
        System.out.println("-------------");
        System.out.println(myArray[1][0]);
        System.out.println(myArray[1][1]);
        System.out.println(myArray[1][2]);
    }
}
