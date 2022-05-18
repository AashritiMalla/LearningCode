//Write a java program to delete the file.

import java.io.File;
public class Deletefiles {
    public static void main(String[] args) {
        File f = new File("file.txt");
        if (f.delete()) {
            System.out.println("Successfully deleted the file: " + f.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }


}
