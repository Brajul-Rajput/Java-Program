// leap year program

package BASIC;
import java.util.Scanner;
public class program17 {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the year : ");
    int year=sc.nextInt();
    if(year%100==0 && year%400==0  && year%4==0 ){
        System.out.println("leap year ");
    }
    else{
        System.out.println("not leap year");
    }
    sc.close();
 }   
}
