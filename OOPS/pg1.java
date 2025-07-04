package OOPS;
 class demo{
        String name;
        String color;

         void show(){
System.out.println("name is "+name+" and color is "+color+".");
         }
    }
    
class pg1{
    public static void main(String[] args) {
demo rf=new demo();
rf.name="fluorescent";
rf.color="orange";
rf.show();
        
    }
   
}