package Special;
// number is even or odd
import java.util.Scanner ;
public class A {
   
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

    
