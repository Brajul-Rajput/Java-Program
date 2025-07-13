package OOPS;

public class oops12 {
    public static void main(String[] args) {
        copy1 ref=new copy1();
        copy1 ref1=new copy1(ref);
        
    }
}
class copy1{
   int a;
   String b;
   copy1(){
    a=10;
    b="code";
    System.out.println(a+" "+b);
   } 
   copy1(copy1 re){
a=re.a;
b=re.b;
System.out.println(a+" "+b);
   }
}
