package PROBLEMS;
import java.lang.Math;
import java.util.Scanner;
public class p9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number : ");
        int num=sc.nextInt();
        int result=0;
        int copy=num;
        while(num>0){
            int unit=num%10;
            result=result+(int)Math.pow(unit,3);
            num=num/10;
        }
        
        if(copy==result){
            System.out.println("amstrong");
        }
        else{
            System.out.println("not amstrong");
        }
    }

}
 