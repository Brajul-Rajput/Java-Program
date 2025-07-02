package PROBLEMS;
//poweer
import java.util.Scanner ;
public class p8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number : ");
        int num=sc.nextInt();
        
        int temp=1;
        System.out.println("enter the power digit : ");
        int pow=sc.nextInt();
        
        while(pow>0){
            temp=num*temp;
            pow--;
        }
        System.out.println(temp);
    }
}
