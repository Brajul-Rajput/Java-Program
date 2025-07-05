package Learn_Code;
class A{
String name;
int age;
 A(){
    name="ramu";
    age=34;
    System.out.println(" Default constructor ");
 }
void show(){
    System.out.println(" Print Name and age of it....");
    System.out.println(name+" "+age);
    System.out.println("Print the data ");

   
    }
}


public class code4 {

    public static void main(String[] args) {
        A ref=new A();
        ref.show();


    }
}
