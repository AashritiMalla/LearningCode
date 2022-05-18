import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the first name : ");
        String firstname = Sc.nextLine();
        System.out.println("enter the last name : ");
        String lastname=Sc.nextLine();
        String Fullname= firstname+lastname;
        System.out.println("enter the Fullname : " + Fullname);
    }
}
