package OOPS;

public class Ecxeption {
    public static void main(String[] args) {
        try{
System.out.println("hello ");
int a=12,b=0,c=a/b;
System.out.println(c);
System.out.println("done ");
        }
        catch(NullPointerException e){  //(Exception e)
           //int x=10;int y=0;int z=x/y;
          // System.out.println(z);
System.out.println(e);
        }
        finally{
              // int x=10;int y=0;int z=x/y;
         //  System.out.println(z);
System.out.println("complete ");
        }
        System.out.println(" finish all ");
    }
}
