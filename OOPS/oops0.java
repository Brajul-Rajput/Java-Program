package OOPS;
class pen{
    String color;
    String type;
    int price;

    public void write(){
        System.out.println("Writing with " + color + " " + type + " pen");
        System.out.println("Price of pen is " + price);
        System.out.println("Writing something");
    }
}
public class oops0 {
    public static void main(String[]args){
        pen p1=new pen();
       p1.color="blue";
       p1.type="gel";
         p1.price=10;
        
         p1.write();
         
    }
}
