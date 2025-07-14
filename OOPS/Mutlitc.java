package OOPS;

public class Mutlitc {
   public static void main(String[] args) {
  
 
    try{
         int arr[]={1,23,34,45};
        System.out.println(arr[9]);
         
    int a=12,b=0,c=a/b;
        System.out.println(c);

       String str=null;
System.out.println(str.toUpperCase());
    
    }
    catch(ArrayIndexOutOfBoundsException a){
System.out.println(a);
    }
    catch(ArithmeticException b){
System.out.println(b);
    }
    catch(NullPointerException c){
System.out.println(c);

    }
    catch(Exception e){
        System.out.println(e);
    }
   } 
}
