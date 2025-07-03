//Decrease  order search in Binary Search
package DSA;

public class BinarySearch2 {
    



    public static void main(String[] args) {
        int rr[]={67,43,35,27,18,14,8,5,2};
        int target;

     BinarySearchDc(rr, 14);
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


