public class Teachers {
    public static void main(String[]args){
        Teacher.Collegename="Diamond";
        Teacher t1=new Teacher(1,"Francesca");
        Teacher t2=new Teacher(2,"Nency");
        System.out.println(Teacher.Collegename);
        t1.print();
        t2.print();
    }







}
class Teacher {
    int id;
    String Name;
    static String Collegename;




    public Teacher(int id, String Name) {
        this.id = id;
        this.Name = Name;}

        void print(){
            System.out.println(this.id);
            System.out.println(this.Name);

    }
}


