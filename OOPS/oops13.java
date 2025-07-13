package OOPS;

public class oops13 {
    public static void main(String[] args) {
        sb ref=new sb();
       ref.hell();
    }
}
class supr{

void hell(){
    System.out.println(" hello coders");
}

    /* 
    int a=10;
    int b=20;
    int c=30;
   */

}
class sb extends supr{

    void hell(){
        super.hell();
        System.out.println("hello world");
    }
   /*  int a=50;
    int b=60;
    int c=70;
    void prnt(){
        System.out.println(super.a);
        System.out.println(super.b);
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    */

}