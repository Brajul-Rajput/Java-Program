package PROBLEMS;
// reverse number 
public class p7 {
    public static void main(String[] args) {
        int num=1234;
        
        while(num>0){
            int unit=num%10;
            System.out.print(unit);
            num=num/10;
        }
    }
}
