package Learn_Code;
  // constructor 

  class demo{
    
    int age ;
    String name;

    demo(){
        age =22;
        name="ramu";
    }
  
     void show(){
        System.out.println("name is "+name+" age is "+age );
     }
    
  }
public class code2 {
    public static void main(String[] args) {
        demo ref=new demo();
        ref.show();
    }
}
