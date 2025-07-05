package Learn_Code;

public class code8 {
    public static void main(String[] args) {
        C ref=new C();
        ref.p3();
    }
}
class A{
   protected String name1="ASA";
   

}
class B extends A{
  protected  int age1 =21;
   

}

class C extends B{
    float weight =23.56f;
    void p3(){
         System.out.println(" Print the name is "+name1 );
 System.out.println(" Print the age "+ age1 );
        System.out.println(" Print the weight "+ weight);
    }

}