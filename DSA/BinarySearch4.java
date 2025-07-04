// find first and last occurances
package DSA;

public class BinarySearch4 {
    public static void main(String[] args) {
        int ar[]={2,2,2,3,4,5,5,5,5,6,7,8};
        BinarySearchIn(ar, 5, true);
        
    }
     public static void BinarySearchIn(int arr[],int target,boolean isf){
int s=0;
int ans=-1;
int e=arr.length-1;

while(s<=e){
   int mid=s+(e-s)/2;
    if(arr[mid]==target){
     ans=mid;
     if(isf==true){
        e=mid-1;
     }
     else{
s=mid+1;
     }

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

