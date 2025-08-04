package WALMART;
public class W3 {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2,3};
       System.out.println( sortedarray(arr, 0));

    }
    
    public static int sortedarray(int arr[],int target){
        int start=0;
        int ans =0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
              ans= mid;
            }
          if(arr[start]<=arr[mid]){
            if(target>=arr[start] && target<arr[mid] ){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
          }
          else{
            if(target>arr[mid] && target<=arr[end]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
          }
        }
      return ans;
    }
}
