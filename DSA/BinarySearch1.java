//Increase order search in Binary Search
package DSA;

public class BinarySearch1 {
    public static void main(String[] args) {
        int rr[]={2,5,8,14,18,27,35,43};
        int target;

     BinarySearchIn(rr, 27);
    }
    public static void BinarySearchIn(int arr[],int target){
int s=0;
int ans=-1;
int e=arr.length-1;

while(s<=e){
   int mid=s+(e-s)/2;
    if(arr[mid]==target){
     ans=mid;
break;
    }
    else if(target>arr[mid]){
        s=mid+1;
    }
    else{
        e=mid-1;
    }
 
}
 if(ans==-1){
        System.out.println("not found element");
    }
    else{
        System.out.println("element found at index is "+ans);
    }
    }
}
