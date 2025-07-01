package BASIC;

public class program21 {
    public static void main(String[] args) {
        int a=1234;
        int k=0,r;
        while(a>0){
        r=a%10;
        k=k+r;
        
        a=a/10;
        }
        System.out.println(k);
    }
}
