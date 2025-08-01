package GEEKSFORGEEKS;
// second largest element in an array
import java.util.Arrays;
public class problem_day1 {
   public static void main(String[] args) {
    int arr[]={12, 35, 1, 10, 34, 1};
Arrays.sort(arr);
int n=arr.length;
int secondlargest=-1;
for(int i=n-2;i>=0;i--){
    if(arr[i]!=arr[n-1]){
        secondlargest=arr[i];
        break;  
    }
}
System.out.println("Second largest element is: " + secondlargest);

 } 
}
