package DSA450;
// Reverse Array 
public class DSA1 {
    public static void main(String[] args) {
       int arr[]={1,2,3,4,5,6};
       for(int b:arr){
        System.out.print(b+" ");
       }
       System.out.println();
       System.out.println("Reverse array");
       for(int i=arr.length-1;i>=0;i--){
        System.out.print(arr[i]+" ");
       } 
    }
}
