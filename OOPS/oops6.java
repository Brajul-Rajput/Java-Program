
package OOPS;

public class oops6 {
    public static void main(String[] args) {
        x xref1=new x(18);
        x xref2=new x(23.45f);
x xref3=new x("rakesh");
x xref4=new x();
xref4.prinn();

    }
}
class x{
    int price ;
    String color;
    int a;
    float v;
    String m;
    double bb;
    x(){
        
    }
    x(int d){
     a=d;
     System.out.println("the value of int is : "+a);
    }
    x(float b){
     v=b;
        System.out.println("the value of float is : "+v);
    }
    x(String name){
     m=name;
        System.out.println("the value of String is : "+m);
    }
    void prinn(){
        System.out.println(price+" "+color);
    }
   
   
}