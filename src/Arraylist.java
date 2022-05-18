import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class Arraylist {



        public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);


            ArrayList<String> address = new ArrayList<>();
for (int i=0;i<8;i++){
    System.out.println("Enter the address");

    String ad=sc.nextLine();
    address.add(ad);
}

            // to print details
            for(String addres: address){
                System.out.println(addres);
            }

        }
    }

