// Find count in array 
package DSA;

public class BinarySearch5 {
    public static void main(String[] args) {
        int ar[]={2,2,3,4,4,4,4,8,9};
        int f=findcount(ar, 3, true);
        int l=findcount(ar, 3, false);
        System.out.println("total count is : "+(l-f+1));
        
    }
    public static int findcount(int arr[],int target,boolean x){
        int ans=-1;
        int s=0;
        int e=arr.length-1;
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
