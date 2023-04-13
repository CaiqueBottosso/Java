// Nested loop: is a loop inside another loop
// Important: use different counter name for each loop
public class NestedLoop {
    public static void main(String[] args) {
        for(int i=1; i<10; i++){// outer loop starts
            for(int j=0; j<10; j++) {// inner loop starts
                System.out.println(i + " " + j);
            }// end of inner loop
            //    System.out.println();
        }//end of outer loop
    }
}
// extension: try to print  number 10 - 99