//reverse number 

package BASIC;
import java.util.Scanner;
public class program20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.println("enter the number : ");
         x=sc.nextInt();
        reverse(x);
sc.close();
    }
    public static int reverse(int num){
        while(num>0){
            int r=num%10;
            System.out.print(r);
            num=num/10;
              //return 0;
    }
        return 0;
    }
}
