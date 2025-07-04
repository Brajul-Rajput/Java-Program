package Learn_Code;
// Parametrized constructor 

class Para{
String x;
int y;

Para(String name ,int weight ){
 x=name;
y=weight;
}
void show(){
    System.out.println("Parametrized Constructor");
   System.out.println(x+" "+y);
}


}
public class code3 {
    public static void main(String[] args) {
        Para ref= new Para("brajul",68);
        ref.show();
    }
}
