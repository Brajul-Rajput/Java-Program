package Special2;
// min and max in an array 
import java.util.Scanner ;
public class array2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of an array ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();// 3 4 56 7 2 4  9 1 45 23 78 
        }
        System.out.print(" element is ");
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
