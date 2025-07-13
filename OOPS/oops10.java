package OOPS;
//Multilevel inheritance 
public class oops10 {
    public static void main(String[] args) {
        c ref=new c();
        ref.pp();
        ref.show();
       // ref.pirnt();
        
    }
}
class a{
    void pp()
    {
        System.out.println("enter the name , rollno , address : ");
    }

}
class b extends a{
    String name;
    int rol;
    String add;

    void show(){
name="kamlesh";
rol=45;
add=" xyz place in new delhi 2020301";
System.out.println(name+" "+ rol+" "+ add);
    }

}
class c extends b{
void pirnt()
{
System.out.println(" all in formation are correct ..");
}
}