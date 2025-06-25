package Arry;
import java.util.Scanner;
public class Arry2 {
   public static void main(String[]args){
    System.out.println("Enter the size of the array:");
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int []arr = new int[size];

    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("output :");
    for(int b:arr){
        System.out.println(b);
    }
   } 
}
