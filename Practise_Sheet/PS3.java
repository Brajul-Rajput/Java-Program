package Practise_Sheet;
// PS3.java convert a number from  any base  to decimal base
import java.util.Scanner;
public class PS3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Enter the base to convert to : ");
        int base = sc.nextInt();
        int power=0;
        int result = 0;
        while(num>0){
            int remainder=num%10;
            result=result+remainder*(int)Math.pow(base,power);
            num=num/10;
            power++;
        }
        System.out.println("Converted number is: " + result);
        sc.close();
    }
}
