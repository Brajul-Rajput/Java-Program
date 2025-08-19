package Special2;
// reverse the array
import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
      Scanner sc =new Scanner (System.in);
      System.out.println("enter the size of aray ");
      int size =sc.nextInt();
      int arr[]=new int [size];
      for(int i=0;i<=arr.length-1;i++){
         arr[i]=sc.nextInt();
      }
      System.out.println("reverse the array is : ");
      for(int i=arr.length-1;i>=0;i--){
        System.out.print(arr[i]+" ");
      }
      sc.close();  
    }
}
