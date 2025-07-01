//palidrome 

package BASIC;
import java.util.Scanner;
public class program22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number is : ");
        int num=sc.nextInt();
        palindrome(num);
    }
    public static int palindrome(int x){
    int r=0 ;
    int c=x;
        while(x>0){
            int  rev=x%10;
            r=(r*10)+rev;
                
             x=x/10;
        }
     
        if(r==c){
            System.out.println("palindrome number ");
        }
        else{
            System.out.println("not palindrome number ");
        }
        return 0;
    }
}
