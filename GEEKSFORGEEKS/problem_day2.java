package  GEEKSFORGEEKS;

public class problem_day2 {
    public static void main(String[] args) {
     int arr[]={2,4,1,3,5};
  System.out.println(   inversionCount(arr));
        
    }

   public  static int inversionCount(int arr[]) {
        // Code Here
        int count =0;
        for(int i=0;i<=arr.length;i++){
            for(int j=1;j<=arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
                
            }
        }
        return count;
    }
}

