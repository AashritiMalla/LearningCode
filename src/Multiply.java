import java.util.Scanner;
public class Multiply {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the first number : ");
        float num1 = Sc.nextFloat();
        System.out.println("enter the second number : ");
        float num2 = Sc.nextFloat();
        float num3=num1*num2;
        System.out.println(" the total number : " + num3);

    }
}
