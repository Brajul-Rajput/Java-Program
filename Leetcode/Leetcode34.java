package Leetcode;
public class Leetcode34 {
    public static void main(String[] args) {
        int rr[]={5,7,7,8,8,10};
        int res[]=new int [2];
      
         int first=BinarySearchFL(rr, 8, true);
       
         int last=BinarySearchFL(rr, 8, false);
         res[0]=first;
         res[1]=last;

System.out.println(first+" "+last);

    }
    public static int  BinarySearchFL(int arr[],int target,boolean x){
int s=0;
int e=arr.length-1;
int ans=-1;
while(s<=e){
    int mid=s+(e-s)/2;
    if(arr[mid]==target){
        ans=mid;
        if(x==true){
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
return ans;
    }
}
