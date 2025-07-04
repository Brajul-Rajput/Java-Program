package Learn_Code;
// class & objects 

class Intro{
String name;
int age ;          // data 

void show(){                           // method 

    System.out.println(" name is "+name + " age is "+age );
}


}
public class Code1 {
    public static void main(String[] args) {
        // object created  
        Intro ref=new Intro();
        ref.name ="Brajul";
        ref.age=21;
        ref.show();
    }
}
