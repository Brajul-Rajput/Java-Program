package WALMART;

public class w6 {
   public static void main(String[] args) {
   
    int arr[]={8,10,2,5,6,1};
    bubblesort(arr);
   } 
   public static void bubblesort(int arr[]){
    int temp;
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]>arr[j+1]){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }

        }
        
    }
    for(int ar:arr){
            System.out.print(ar+" ");
        }
   }
}
