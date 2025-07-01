// power 
package BASIC;
import java .util.Scanner;
import java.lang.Math;
public class program13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int num=sc.nextInt();
        System.out.println("enter the power of number is : ");
        int po=sc.nextInt();
        int result=(int) Math.pow(num,po);
        System.out.println(" the power is number " +result);
        sc.close();
    }
}
