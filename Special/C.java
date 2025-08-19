package Special;
import java.util.Scanner;
// prime number  2.3 4 ,5 ,6 
public class C {
    public static void main(String[] args) {
       Scanner sc =new Scanner (System.in); 
       int num=sc.nextInt();
       for(int i=1;i<=num;i++){
        if(num%i==0){
            System.out.println(num+" prime");
        }
        else {
             System.out.println(num+" non prime");
        }
       }
    }
}
