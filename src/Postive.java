import java.util.Scanner;
public class Postive {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  number");
        int num=sc.nextInt();

        if (num>0 ) {
            System.out.println(" number is positive");

        }else if (num<0){
            System.out.println(" number is negative");
        }else if (num==0) {
            System.out.println(" number is zero");

        }else {
            System.out.println("something went wrong");
        }

    }

}


