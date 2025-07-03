// Order Agnostic Binary Search
package DSA;

public class BinarySearch3 {
    public static void main(String[] args) {
    int rr[]={20,30,40,50,60};
    int rr2[]={10,9,8,7,6,5,4,3};
    int arr3[]={3,3,3,3,3};
    OrderAgnostic(rr,60);
    }
    public static void OrderAgnostic(int arr[],int target){
        int s=0;
        int e=arr.length-1;
        if(arr[s]==arr[e]){
            System.out.println("All element are same ");
        }
        else if(arr[s]<arr[e]){
            BinarySearchIn(arr, target);
        }
        else{
            BinarySearchDc(arr, target);
        }
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
     public static void BinarySearchDc(int arr[],int target){
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
     e=mid-1;
    }
    else{
        s=mid+1;
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
