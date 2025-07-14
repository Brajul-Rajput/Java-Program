package OOPS;

public class oops15 {
    public static void main(String[] args) {
        A r=new A();
        r.show(100);
     System.out.println(r.disp());
    }
}
class A{
    private int value;

    public void show(int x){
value=x;
    }

    public int disp(){
        return value;
    }
}
