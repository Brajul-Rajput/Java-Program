package Practise_Sheet;
// PS2.java reverse a number
import java.util.Scanner;
public class PS2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        int result = 0;
        while(num>0){
            int remainder = num % 10;
            result = result * 10 + remainder;
            num = num / 10;
        }
        System.out.println("Reversed number is: " + result);
        sc.close();
    }
}
