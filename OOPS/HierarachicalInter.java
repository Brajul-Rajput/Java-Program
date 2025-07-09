package OOPS;
public class HierarachicalInter {
    public static void main(String[] args) {
        B b1=new B();
        b1.input();
        b1.show();
        
        C c1=new C();
        c1.input();
        c1.disp();
    }
}
class A{
    void input(){
        System.out.println("enter the name : ");
    }
}
class B extends A{
    void show(){
        System.out.println("my name is akkr ");
    }
}
class C extends A{
    void disp(){
        System.out.println("my name is ajidmv");
    }
}

