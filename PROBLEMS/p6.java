
package PROBLEMS;
import java.lang.Math;
import java.util.Scanner;
public class p6 {



public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the number : ");
    int num=sc.nextInt();
    System.out.println("enter the base ");
    int base=sc.nextInt();
    int po=0;
    int x=0;
    while(num>0){
        int unit=num%10;
          num=num/10;
          x=x+(int)unit*(int)(Math.pow(base, po)); 
         po++;
        
    }
    System.out.println(x);
    sc.close();
  }  
}
