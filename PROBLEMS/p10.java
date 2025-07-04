package PROBLEMS;
import java.util.Scanner;
class p10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array :  ");
        int size=sc.nextInt();
        int arr[]=new int [size];
        sc.close();
        for(int i=1;i<=size;i++){
            if(i%2==0 && i%3==0 ){
                System.out.println(i+" prime ");
            }
            else{
                System.out.println(i+" not  prime ");
            }

        }
    }
}