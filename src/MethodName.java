
//Write a program in Java to create and print your own name using the method.
import java.util.Scanner;
public class MethodName {
    public static void main(String[]args){


        Name();
    }

    public static void Name() {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter your first name");
        String firstname = sc.nextLine();
        System.out.println(" Enter your last name");
        String Lastname = sc.nextLine();
        String fullname= firstname +"  " + Lastname;
        System.out.println(" The full name is " + fullname );
    }
}
