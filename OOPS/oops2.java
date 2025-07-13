package OOPS;

public class oops2 {
    public static void main(String[] args) {
        One r=new One();
        r.prnt();
    }
}
class One{
    String name;
    float weight;
    void prnt(){
        System.out.println(name+ " "+weight);
    }
}
