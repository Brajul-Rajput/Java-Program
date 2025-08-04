package WALMART;

public class W1 {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,11,15};
        System.out.println(floor(arr, 2));
    }
    public static int floor(int arr[],int target){
        int s=0;
        int e=arr.length-1;
        int ans=0;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
               return arr[mid];
            }
            else if(target>arr[mid]){
                s=mid+1;
            ans =arr[mid];
            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }
}
