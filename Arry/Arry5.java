package Arry;
import java .util.Scanner;
public class Arry5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int size;
       System.out.println("enter the size of element :");
       size=sc.nextInt();
       int arr[]=new int [size+1];
       System.out.println("enter the elements : ");
       for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
       }
       System.out.println("enter the locatin insert element :" );
       int loc=sc.nextInt();
       System.out.println("enter the element to insert : ");
       int ele=sc.nextInt();
       if(loc<0 || loc>size){
        System.out.println("Invalid location");
       }
       else if(loc==size){
arr[size]=ele;
       }
       else{
        for(int i=size;i>loc;i--){
            arr[i]=arr[i-1];
        }
        arr[loc]=ele;
        size++;
       }
       for(int b:arr){
        System.out.println(b + " ");
       }
       
      sc.close();  
}
}