package BASIC;

public class Program5 {
    int a=10;   // Instance variable
    static int b=20;    // Static variable
    public static void main(String[] args) {
        int c=30;      // Local variable
        final int d=40;    // Final variable
        Program5 obj=new Program5();
        System.out.println("Instance variable a: "+obj.a);
        System.out.println("Static variable b: " + b);
        System.out.println("Local variable c: " + c);   
        System.out.println("Final variable d: " + d);

    }
}