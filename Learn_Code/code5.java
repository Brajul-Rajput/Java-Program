package Learn_Code;
//Instance Blocks 
class insta{
    int x;
    String y;
    {
        System.out.println(" first print in it ...");
    }
    
    insta(int age ,String name){
      x=age;
     y=name;
    }
    void disp(){
        System.out.println("second print : ");
        System.out.println("Parametrized constructor : ");
        System.out.println(x+" "+y);
    }
}
public class code5 {
    public static void main(String[] args) {
        insta ref=new insta(21,"Kka");
        ref.disp();
    }
}
