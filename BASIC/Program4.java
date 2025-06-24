// Sum of n natural numbers
package BASIC;
import java.util.*;
public class Program4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number : ");
    int nums=sc.nextInt();
    int sum=0;
    for(int i=1;i<=nums;i++){
        sum+=i;   //sum=sum+i;
    }
    System.out.println("Sum of first "+nums+" natural numbers is "+sum);
    }
}