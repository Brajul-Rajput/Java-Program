//digit count 
package BASIC;
import java.util.Scanner;
public class program16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("enter the digit : ");
        int digit=sc.nextInt();
        while(digit>0){
            digit/=10;
            count++;
        }
        System.out.println(count);
    }
}
