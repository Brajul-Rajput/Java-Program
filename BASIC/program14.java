package BASIC;
import java.util.Scanner;
public class program14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.println("enter the number 1 : ");
        num1=sc.nextInt();
        System.out.println("enter the number 2 : ");
        num2=sc.nextInt();
        if(num1>num2){
            System.out.println(num1+" Number is greater then  "+num2);
        }
        else{
             System.out.println(num2+" Number is greater then  "+num1);
        }
        sc.close();
    }
}
