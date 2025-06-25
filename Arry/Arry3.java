package Arry;
import java.util.*;
public class Arry3 {
    public static void findprint(int arr[],int find){
        for(int i=0;i<arr.length;i++){
if(find==arr[i]){
    System.out.println(i);
}

        }
        
    }
    public static void main(String[]args){
    
        Scanner sc=new Scanner(System.in);
        int []arr={10,20,30,40,50,60,70,80,90,100};
        System.out.println("Arrays Element: ");
       for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
       }
        int find;
      System.out.println("Find element index is");
      findprint(arr,70);

       
    }
}
