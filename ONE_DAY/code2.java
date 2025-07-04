package ONE_DAY;
import java .util.Scanner;
public class code2 {
    public static void main(String[] args) {
        // Arithematic operator 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number is :");
        int a=sc.nextInt();
        System.out.println("enter the number is :");
        int b=sc.nextInt();
        
        System.out.println("Addition is "+(a+b));
        System.out.println("Substration is "+(a-b));
        System.out.println("Multipication is "+(a*b));
        System.out.println("Division is "+(a/b));
        System.out.println("Remainder is "+(a%b));
        sc.close();

    }
}
