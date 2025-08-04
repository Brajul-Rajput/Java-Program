package ONE_DAY;

public class code4 {
    public static void main(String[] args) {
        int arr[]={2,3,2,2};
System.out.println(inversion(arr));
    }
    public static int inversion(int arr[]){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                 count++;
                }
               
              
            }
        }
        return count;
    }
    
}
