//Write a program in Java to reverse a String using function.

import java.util.Scanner;
public class Reverse {
public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the words that you want to reverse");
    String w=sc.nextLine();

    System.out.println("Orginal Word is " + " " + w);
    StringBuilder reverseString = new StringBuilder(w);
    reverseString.reverse();
    String result = reverseString.toString();


    System.out.println("Reversed string: "+result);
}
}
