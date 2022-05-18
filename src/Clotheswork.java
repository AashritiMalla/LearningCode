public class Clotheswork {
    public static void main(String[]args){
Addidas a1=new Addidas();
a1.printBrand();

    }

}
 abstract class Clothes{
    public abstract void printBrand();

 }
class Addidas extends Clothes{
    public void printBrand(){
        System.out.println("Addidas shoes");
    }

}

