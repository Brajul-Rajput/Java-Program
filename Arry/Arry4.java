package Arry;
import java .util.Scanner;
public class Arry4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of array : ");
        int size=sc.nextInt();

        char []arr=new char[size];
        System.out.println("enter arrays :");

        for(int i=0;i<size;i++){
            arr[i]=sc.next().charAt(0);
        }

        System.out.println("output is : ");

        for(char  b:arr){
            System.out.print(b+" ");
        }
        sc.close();
    }
}





   
   

