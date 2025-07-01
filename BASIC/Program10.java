// character vowel or consoant 

package BASIC;
import java .util.Scanner;
public class Program10 {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Captical  character : ");
    char ch=sc.next().charAt(0);
    if(ch=='A'|| ch=='E'||ch=='O'||ch=='I'||ch=='U'){
        System.out.println("vowel ");
    }
    else{
        System.out.println("consonat");
    }
    sc.close();
}
    
}
