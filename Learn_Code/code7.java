package Learn_Code;
// Simple Inheritance 
public class code7 {
public static void main(String[] args) {
    S2 ref=new S2();
    ref.prst();
}
    
}
 class S1{
   protected  int num=10;
  int num1=20;
   protected void dsp(){
System.out.println("sum is : "+(num+num1));
System.out.println("sub is : "+(num-num1));
  }

}
class S2 extends S1{
    int a=30;
    int b=40;
    void prst(){
        System.out.println(" multi is "+(a*b));
        System.out.println(" divide is "+(a/b));
        System.out.println(" num & num1 "+(num*num1));
    }

}
