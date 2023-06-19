
import java.io.FileWriter; // Import class to write to the file
import java.io.IOException;
public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter obj = new FileWriter("Courses to make.txt", false);
            obj.write("Front End\nBack End\nData Base");
            obj.close();
        }catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
