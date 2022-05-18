
import java.io.File;

public class Lotsoffile {


    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) {
            try {
                File f=new File( i +"Everest.txt");
                if (f.createNewFile()) {
                    System.out.println("File is succ`essfully " + f.getName());
                } else {
                    System.out.println("Seems like file already exist.");
                }


            } catch (Exception e) {
                System.out.println("An error occurred. " + e.getMessage());

            }
        }
    }
}






