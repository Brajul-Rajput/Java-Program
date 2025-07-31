package BINARY_SEARCH;

public class binary_search {
    public static void main(String[] args) {
      int nums[]={5,8,11,17,23,31,57,98};
      int nums2[]={90,87,67,34,23,12,9,5};
       
       System.out.println(binaryincre(nums, 31)); // Output: 5

       System.out.println(binarydecre(nums2, 9)); // Output: 6

       System.out.println(
              "Binary Search Anagnostic: " + binaryincre(nums, 31) // Output: 5
                + ", " + binarydecre(nums2, 9) // Output: 6 
                
       );
      
    }
    public static void binartsearchanagnostic(int nums[],int tartget){
        int start=0;
        int end=nums.length-1;
         if(nums[start]<nums[end]){
            System.out.println(binaryincre(nums, tartget));
    } 
    else{
            System.out.println(binarydecre(nums, tartget));
        }
    }
public static int binarydecre(int nums[],int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target>nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static int binaryincre(int nums[],int target){

        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
    
