public class Micwork {
    public static void main(String[] args) {

        Mic m1= new Mic( 1,"Samsung",30);
        m1.printinfo();
        Mic m2=new Mic(2,"Sony",3);
        m2.printinfo();
    }
}
  class Mic{
      int id;
      String name;
      int price;

      public Mic(int id, String name,int price) {
          this.id = id;
          this.name = name;
          this.price = price;


      }
      void printinfo(){
          System.out.println(this.id);
          System.out.println(this.name);
          System.out.println(this.price);
          System.out.println("*****************");

      }
  }