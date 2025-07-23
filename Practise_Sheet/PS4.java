package Practise_Sheet;
// decimal to any base conversion
import java.util.Scanner;
public class PS4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Enter the base to convert from: ");
        int base= sc.nextInt();
        int result = 0;
        int power = 0;
        while(num>0){
            int remainder = num % base;
            result += remainder * Math.pow(10, power);
            num /= base;
            power++;
        }
        System.out.println("Converted number is: " + result);
        sc.close();
    }
}