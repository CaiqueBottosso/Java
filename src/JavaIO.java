import java.io.File;
import java.io.IOException;

public class JavaIO {
    public static void main(String[] args) {
        // to handle errors, we use try-catch block
        try {
            File obj = new File("Courses to make.txt");
            if (obj.createNewFile()){
                System.out.println("File created");
            } else {
                System.out.println("File already exist.");
            }
        }catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


}
