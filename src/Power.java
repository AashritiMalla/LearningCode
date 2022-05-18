/*
Write a program in Java to calculate power of certain number. For e.g 5^3=125
 */
import java.util.Scanner;
public class Power {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println(" Enter the base");
        int b=sc.nextInt();
        System.out.println(" Enter the exponent");
        int e=sc.nextInt();

        double result= Math.pow(b, e);
        System.out.println(" answer " + result);
    }
}
