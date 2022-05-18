public class Laptopwork {

    public static void main(String[] args) {
       Laptop l1=new Laptop();
       l1.name="Lenovo";
       l1.numberofram= 32;
        System.out.println(l1.name);
        System.out.println(l1.numberofram);

        Laptop l2=new Laptop();
        l2.name="Dell";
        l2.numberofram= 52;
        System.out.println(l2.name);
        System.out.println(l2.numberofram);

    }
}
class Laptop{
    String name;
    int numberofram;

}