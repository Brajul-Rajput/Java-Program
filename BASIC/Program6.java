package BASIC;
import java.util.Scanner;
public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number Integer : ");
        int num = sc.nextInt();
        System.out.println("The number you entered is : " + num);
        double num1=num;   // Implicit conversion from int to double
        System.out.println("Then convert into : "+num1);
     System.out.println("Enter the Number Float :");
     double num3=sc.nextDouble();
     System.out.println("The number you entered is : "+num3);
     int num4=(int)num3; // Explicit conversion from double to int
     System.out.println("Then convert into : "+num4);
    }
}
