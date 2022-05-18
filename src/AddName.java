import java.io.FileWriter;
public class AddName {


        public static void main(String[] args) {
            try {
                FileWriter myWriter = new FileWriter("Hello.txt");
                myWriter.write("Aashriti Malla");
                myWriter.close();
                System.out.println("Write to file successful.");
            } catch (Exception e) {
                System.out.println("Error "+e.getMessage());
            }
        }
    }

