// Digit Count in log method
package PROBLEMS;
import java.lang.Math;
import java .util.Scanner;
class p2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number : ");
    int num=sc.nextInt();
    int result=(int) ((int)Math.log(num)/Math.log(10))+1;
    System.out.println(result);
    sc.close();
  }  
}
