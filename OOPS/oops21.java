package OOPS;

public class oops21 {
    public static void main(String[] args) {
        shape s=new rectangle();
        s.draw();
    }
}
class shape{
    void draw(){
        System.out.println("Drawing a shape");
    }

} 
class circle extends shape{
    @Override
     void draw(){
        System.out.println("Drawing a circle");
    }
}
class rectangle extends shape{
    @Override
     void draw(){
        System.out.println("Drawing a rectangle");
    }
}