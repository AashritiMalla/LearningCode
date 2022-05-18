public class Houseproperties {
 public static void main(String[]args) {
House h1=new House();

  h1.id= 1;
  h1.name="Villa";
  h1.price=500000;
  System.out.println( h1.id);
  System.out.println( h1.name);
  System.out.println( h1.price);

  House h2=new House();
  h2.id= 2;
  h2.name="Bungalow";
  h2.price=800000;
  System.out.println( h2.id);

  System.out.println(h2.name);
  System.out.println(h2.price);


  House h3=new House();
  h3.id= 3;
  h3.name="Cottage";
  h3.price=1000000;
  System.out.println( h3.id);
  System.out.println(h3.name);
  System.out.println(h3.price);

 }
}
 class House{
 int id;
 String name;
 int price;


}
