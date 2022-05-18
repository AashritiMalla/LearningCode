/*
Write a java program to create a new file called “hello.tx
 */
import java.io.File;
public class Hello {
    public static void main(String[] args) {
        try {
            File f = new File("hello.txt");
for (int i=0;i<=100;i++){

}
            if (f.createNewFile()) {
                System.out.println("File is successfully " + f.getName());
            } else {
                System.out.println("Seems like file already exist.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred. " + e.getMessage());

        }

    }
}

