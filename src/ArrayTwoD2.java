public class ArrayTwoD2 {
    public static void main (String [] args){
        //Multidimensional array =  multiple rows and multiple cols
        int [][] myArray = {{1,7,60,65},
                {35, 37, 21, 11}};
        // printing multiD array
        for (int i = 0; i < myArray.length; i++){
            for(int n = 0; n < myArray[i].length; n++){
                System.out.println(myArray[i][n]);
            }
        }
    }
}
