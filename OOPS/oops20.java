package OOPS;
// method overloading in java
public class oops20 {
    public static void main(String[] args) {
        animal a = new animal();
        a.eat();
        a.eat("grass");
        a.eat("grass", 5);
    }
}
class animal{
    

void eat(){
    System.out.println("eating...");
}

void eat(String food){
    System.out.println("eating " + food);
}

    void eat(String food, int quantity){
        System.out.println("eating " + food + " in quantity of " + quantity);
    }
}
