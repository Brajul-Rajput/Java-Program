// Print n matural numbers

package BASIC;
import java.util.*;
public class Program3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers :");
        int nums=sc.nextInt();
        for(int  i=1;i<=nums;i++){
            System.out.print(i+" ");
        }
    }
}
