package OOPS;

public class MutliExption {
    public static void main(String[] args) {
        int arr[]={10,20,30};
        try{
            int a=10,b=0,c=a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
System.out.println(arr[5]);
        }
        catch(Exception n){
            System.out.println(n);
        }
    }
}
