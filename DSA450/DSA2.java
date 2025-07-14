package DSA450;
// F ind the maximum and minimum element in an array
public class DSA2 {
    public static void main(String[] args) {
        int arr[]={10,20,30,4,90,100,80,50};
        max(arr);
      min(arr);
    }
}


 public static void max(int ar[]){
    int max=ar[0];
  for(int i=0;i<ar.length;i++){
            if(ar[i]>max){
                max=ar[i];
            }
        }
            System.out.println(max);
        }



public static void min(int ee[]){
int min=ee[0];
for(int j=0;j<ee.length;j++){
    if(ee[j]<min)
        min=ee[j];
}
System.out.println(min);
}
