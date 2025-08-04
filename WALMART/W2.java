package WALMART;

public class W2 {
    public static void main(String[] args) {
        int arr[]={2,2,4,6,7,7,11,16};
        System.out.println(celing(arr, 13));

    }
    public static int celing(int arr[],int target){
        int ans=0;
        int s=0;int e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==target){
                return arr[m];
            }
            else if (target>arr[m]){
                s=m+1;
            }
            else{
                e=m-1;
                ans=arr[m];
            }
        }
        return ans;

    }
}
