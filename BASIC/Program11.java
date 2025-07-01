// print the ascii value of character

package BASIC;
import java .util.Scanner;
public class Program11 {
 public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    char ch;
    System.out.println("enter the character : ");
    ch=sc.next().charAt(0);
    int as=ch;
    System.out.println(as);
    sc.close();
 }   
}
