import java.time.LocalDate;
import java.util.Scanner;
public class DateWork {


        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter the birth year");
            int y= sc.nextInt();
            LocalDate date = LocalDate.now();


            int age= date.getYear()-y;
            System.out.println("Your current age is" + age);





            System.out.println("Local Date is "+date);

        }
    }

