/*package GEEKSFORGEEKS;
// second largest element in an array
import java.util.Arrays;
public class problem_day1 {
   public static void main(String[] args) {
    int arr[]={12, 35, 1, 10, 34, 1};
    System.out.println(secondLargest(arr));
 //Arrays.sort(arr);
//System.out.println("Second largest element is: " + arr[arr.length - 2]);
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

public  static int secondLargest(int arr[]) {
    int n = arr.length;
    int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

    for (int num: arr) {
        if (num > first) {
            second = first;
            first = num;
        } else if (num > second && num!= first) {
            second = num;
        }
    }
    return second;
}
}
*/