package OOPS;

public class oops8 {
   
    public static void main(String[] args) {

        cons ref=new cons();
        ref.random();
        System.out.println(" code is running main method  ");
    }
    static int a=10;
    static{
        System.out.println(a);
        System.out.println("static block of code running ");
    }

}
class cons{
      {
        System.out.println(" instance block of code ...........");
    }
void random(){
    System.out.println(" constructor  code is running ");
}
}
