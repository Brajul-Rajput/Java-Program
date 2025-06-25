
/*
 * Problem statement
Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -

totalSalary = basic + hra + da + allow – pf
where :
hra   = 20% of basic
da    = 50% of basic
allow = 1700 if grade = ‘A’
allow = 1500 if grade = ‘B’
allow = 1300 if grade = ‘C' or any other character
pf    = 11% of basic.
 */
package PROBLEMS;
import java.util.*;
public class p1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the basic Slary");
        int basic=sc.nextInt();
        
System.out.println("Enter the grade");

char grade=sc.next().charAt(0);
int allow=0;
if(Character.toUpperCase(grade)=='A'){
 allow=1700;
    }
    else if(Character.toUpperCase(grade)=='B'){
 allow=1500;
}
else if(Character.toUpperCase(grade)=='C'){
 allow=1300;
}
else{  
     allow=1300;
}
double hra=0.2*basic;
 int a=(int)Math.round(hra);

    double da=0.5*basic;
    int da1=(int)Math.round(da);
    double pf=0.11*basic;

    int pf1=(int)Math.round(pf);
    int  gross=basic+a+da1+allow-pf1;
     
    System.out.println("The Gross Salary is "+gross);
    }
}