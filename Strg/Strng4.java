package Strg;

public class Strng4 {
    public static void main(String[] args) {
        String joblocation="Noida , Pune , Hyderabad , Chandigarh , Bangalore , Chennai"; 
        String arr[]=joblocation.split(" ,");
        for(String b: arr){
            System.out.print(b+" ");
        }
    }
}
