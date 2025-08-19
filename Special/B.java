package Special;
// factorial 
import java.util.Scanner;
public class B {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number : ");
    int num=sc.nextInt();
    int mun=1;
    for(int i=1;i<=num;i++){
        mun*=i;
    }
    System.out.println("Factorial "+num+" is "+mun);
}    
}
