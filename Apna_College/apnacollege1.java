package Apna_College;
import java.util.Scanner;

public class apnacollege1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        char  arr[]=new char [size];
        System.out.println("enter your name in character format  : ");
        for(int i=0;i<arr.length;i++){
            char ch=sc.next().charAt(0);
        }
        System.out.println();
        for(char b: arr){
            System.out.print(b+" ");
        }
    }
}
