public class Copy {
    public static void main(String[]args){
Copywork c1=new Copywork();
c1.setName("harry potter");
c1.setId('1');
c1.printinfo();

        Copywork c2=new Copywork();
        c2.setName("lotus");
        c2.setId('5');
        c2.printinfo();

    }
}
class Copywork{
  private  int id;

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    void printinfo(){
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println("--------");

    }

}
