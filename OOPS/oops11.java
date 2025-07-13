package OOPS;
// simple inheritance 
public class oops11 {
    public static void main(String[] args) {
        B ref=new B();
        ref.show();
        ref.dis();
    }
    
}
class A{
    int age =23;
    String name="raman";
    void show(){
        System.out.println(name+" "+age);
    }

}
class B extends A{
    Long num=342223245450l;
    String addres ="xyz addresss place";
 void dis(){
    System.out.println(num+" "+addres);
 }

}
