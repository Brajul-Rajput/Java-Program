package OOPS;

public class oops4 {
    public static void main(String[] args) {
        loc re=new loc("RAMESH", 33, true);
        re.displ();
        loc rep=new loc(9545323456l, "abc@gmail.com");
        rep.nep();

    }
}
class loc{
    String name;
    int age;
    boolean value;
    Long number;
    String email;
    loc(Long d,String  v){
number=d;
email=v;
    }
    loc(String x,int y,boolean z){
        name=x;
        age=y;
        value=z;
    }
    void displ(){
        System.out.println(name+" "+ age+" "+value);
    }
    void nep(){
        System.out.println(number+" "+email);
    }
}
