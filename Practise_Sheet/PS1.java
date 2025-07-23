package Practise_Sheet;

// PS1.java even odd checking by binary digit
import java.util.Scanner;
public class PS1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if it is even or odd:");
        int num = sc.nextInt();
        if(num%2==1){
        System.out.println("the number is odd");
        }  
        else if(num%2==0){
            System.out.println("the number is even");
        }  
        else {
            System.out.println("the number is neither even nor odd");
        }
        sc.close();
    }
}
