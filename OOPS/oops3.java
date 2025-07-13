package OOPS;

public class oops3 {
    public static void main(String[] args) {
        Two f=new Two();
        f.prnt();
    }
}
class Two{
    String name;
    int age;
   /* Two(){
        age=21;
        name="kaka";
    }
        */
    void prnt(){
        System.out.println(name+" " +age);
    }
}