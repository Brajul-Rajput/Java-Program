package OOPS;

public class oops1 {
    public static void main(String[] args) {
        deo ref=new deo();
        ref.show();
    }
}
class deo{
    String name="Raju";
    int id=21;
    void show(){
        System.out.println("code running ");
        System.out.println(name+" "+id);
    }
}
