package OOPS;

public class oops7 {
    static {
        int a=10;
        System.out.println(a);
        System.out.println(" first print at all....");
    }
    static {
        System.out.println(" next print");
    }
    public static void main(String[] args) {
        seven sev=new seven();
    }
}
class seven{
    int rate;
    String color;
    
    seven(){
        rate=23;
        color="black";
        System.out.println(" second print at all ...");
System.out.println(rate+" "+color);
    }

}
