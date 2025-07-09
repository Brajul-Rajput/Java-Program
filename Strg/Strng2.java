package Strg;

public class Strng2 {
    public static void main(String[] args) {
        String name="abc";
        String name2=name;
        System.out.println(name);   //abc
        System.out.println(name2);   //abc
        name2="xyz";
        System.out.println(name);   // abc
        System.out.println(name2);     //xyz
}
}