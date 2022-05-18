//Write a java program to copy the file.
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
public class Copyfile {
    public static void main(String[] args) throws IOException
    {
        File sourceFile = new File("Hello.txt");

        File destFile = new File("file.txt");

        Files.copy(sourceFile.toPath(), destFile.toPath());

        System.out.println("Success");
    }
}

