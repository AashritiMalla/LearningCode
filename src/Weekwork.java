import java.util.ArrayList;

public class Weekwork {
    public static void main(String[]args){
        ArrayList<Week> Weeks=new ArrayList<Week>();
        Weeks.add(new Week(200,100,500) );

        Weeks.add(new Week(300,200,1000) );
        Weeks.add(new Week(200,300,1200) );



        for(Week w:Weeks){
            w.print();

        }

    }
}
class Week {

    double Grocery;
    double Gas;
    double rent;


    Week(double Grocery, double Gas, double rent) {

        this.Grocery = Grocery;
        this.Gas = Gas;
        this.rent = rent;


    }

    void print() {
        System.out.println("Grocery expenses" + this.Grocery);
        System.out.println("Gas expenses" + this.Gas);
        System.out.println("rent expense" + this.rent);


        System.out.println("\n");


    }
}


