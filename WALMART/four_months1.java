package WALMART;
import java.util.Scanner ;
// number is even or odd 
public class four_months1 {
  public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the number : ");
    int num=sc.nextInt();
    if(num%2==0){
        System.out.println(num+" Even");
    }
    else{
        System.out.println(num+" Odd");
    }
    sc.close();
  }  
}
