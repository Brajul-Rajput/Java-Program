//Amstrong Number

package PROBLEMS;
import java.util.Scanner;
public class p3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
System.out.println("enter the numbers : ");
int num=sc.nextInt();
int copy=num;
int re=0;
while(num>0){
     int rev=num%10;
re= re+(int)Math.pow(rev,3);
num=num/10;
}
System.out.println(re==copy);
sc.close();
    }

}
