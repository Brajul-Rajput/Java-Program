package Learn_Code;
class Easy{
    {
        //
System.out.println(" Instance --->  program line 1 is : ");
    }
    static {
String name="SAHIL";
int age =23;
System.out.println("Static program ------>");
System.out.println(" Print the name and age of it is : "+name +" & "+age );
    }
    int num;
    char ch;
    Easy(int x, char v ){
num=x;
ch=v;
System.out.println("Parametrized constructor -----> ");
    }
    void dsp(){
        System.out.println(" Method is ------>");
        System.out.println(" print data is : ");
        System.out.println(num+" "+ch);
    }
}
public class code6 {
    public static void main(String[] args) {
        Easy ef=new Easy(12, 'w');
        ef.dsp();
        
    }
}
