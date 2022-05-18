//Write a java program to append content to a file that has already your name.
import java.io.FileWriter;
public class Addtofile {
    public static void main(String[] args) {
        try {
            // Don't forget to add true here if you want to append.
            FileWriter myWriter = new FileWriter("Hello.txt",true);
            myWriter.write(" My name is Aashriti Malla.!");
            myWriter.close();
            System.out.println("Write to file successful.");
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
    }
}

