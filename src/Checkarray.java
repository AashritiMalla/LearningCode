/*
Write a program in Java to check array contains a given value or not.
 */
import java.util.Scanner;
public class Checkarray {
    public static void main(String[]args){
        int [] num={6,3,4,7,8,9,10,14,16,15,20,30,40};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find");
        int num1=sc.nextInt();
        int toFind = num1;
        boolean found = false;

        for (int n : num) {
            if (n == toFind) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " is not found.");
    }
}



