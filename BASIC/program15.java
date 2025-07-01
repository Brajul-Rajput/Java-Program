package BASIC;
import java.util.Scanner;
public class program15 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num1,num2,num3;
    System.out.println("enter the numner 1 : ");
    num1=sc.nextInt();
     System.out.println("enter the numner 2 : ");
    num2=sc.nextInt();
     System.out.println("enter the numner 3 : ");
    num3=sc.nextInt();
    if(num1>num2){
if(num1>num3){
System.out.println(num1+" is greater than "+num2+" "+num3);
}
else{
System.out.println(num3+" is greater than "+num1+" "+num2);
}
    }
    else{
        if(num2>num3)
        {
System.out.println(num2+" is greater than "+num1+" "+num3);
        }
        else{
System.out.println(num3+" is greater than "+num1+" "+num2);
        }

    }
    sc.close();
   } 
}
