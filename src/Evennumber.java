//Write a program in Java to print even number between intervals using methods.
import java.util. Scanner;
public class Evennumber {
    public static void main(String[]args){
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter the intial number");
 int s=sc.nextInt();
        System.out.println("Enter the final number");
        int f=sc.nextInt();
        Even(s,f);
    }


  public static void Even(int start, int end ){
        for (int i =start; i<=end ;i++){
            if (i %2== 0){
                System.out.println("The number is Even"  + " " +i);
            }
        }
    }
}
