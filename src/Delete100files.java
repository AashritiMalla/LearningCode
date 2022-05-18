import java.io.File;
public class Delete100files {
    public static void main(String[] args) {

            File f = new File("Everest.txt");
            for (int i = 1; i <= 100; i++) {
            if (f.delete()) {
                System.out.println("Successfully deleted the file: " + f.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        }

    }
}