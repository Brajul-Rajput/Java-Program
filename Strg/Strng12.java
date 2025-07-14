package Strg;

public class Strng12 {
    public static void main(String[] args) {
        String demo="   hello  world  ";
        String str=" ";
      String demo1[]=demo.split("");
     for(String b:demo1){
        System.out.print(b);
     }
for(int i=demo1.length-1;i>=0;i--){
    System.out.println(demo1+" ");
}

    }
}
