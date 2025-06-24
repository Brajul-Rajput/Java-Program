// Add two number using input

package BASIC;
import java.util.*;
public class Program2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number 1 : ");
        int num1=sc.nextInt();
        System.out.print("Enter the number 2 : ");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is : " + sum);
    }
}
