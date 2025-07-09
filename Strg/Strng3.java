package Strg;

public class Strng3 {
    public static void main(String[] args) {
        String name ="brajul";
     System.out.println(name.toUpperCase());
     System.out.println(name.toLowerCase());
        String name2="Ramkumar Sharma";
        String name3="brajul  ";
        System.out.println(name==name2);
        System.out.println(name==name3);
        System.out.println(name.equals(name3));
       char ch[]=name.toCharArray();
       for(char b:ch){
       System.out.print(b +" ");
       }
    String name4="rajput";
       System.out.println(name.compareTo(name3));
       System.out.println("brajul".startsWith(name));

       String c="            fuwjnfuijnxf               ";
       System.out.println(c);
       System.out.println(c.trim());

System.out.println(name.endsWith(c));
System.out.println(name2.substring(3));
System.out.println(name.substring(2,4 ));
    }
}
