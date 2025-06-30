package OOPS;
import java.util.Scanner;
interface client{
    void input();
    void output();
}

class Dvlp implements client{
String name;
double sal;
public void input(){
Scanner sc=new Scanner(System.in);
System.out.print("enter the name : ");
name=sc.nextLine();
System.out.print("enter the salary : ");
sal=sc.nextDouble();
}
public void output(){
    System.out.println(name);
    System.out.println(sal);
}
 

}
public class interfce{
public static void main(String[] args) {
    client c=new Dvlp();
    c.input();
    c.output();
}
}