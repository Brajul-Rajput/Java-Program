package STACK;
import java.util.Scanner;

public class stackk1 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = sc.nextInt();
        Stack stack = new Stack(size);
        stack.push(10);
        stack.push(20);
        stack.pop(30);
        stack.push(40);

        stack.push(50);
        stack.push(60);
      //  stack.push(70); // This will show "stack is full" message
        stack.display();

    }
}

class Stack {
     int[] stack;
     int top;
     int maxsize;
    

    public Stack(int size) {
        maxsize = size;
        stack = new int[maxsize];
        top = -1;
    }

public  void push(int num){
    if(top>=maxsize-1){
        System.out.println("stack is full");
    }
    else{
        top++;
        stack[top]=num;
    }
}

public void pop(int num){
    if(top==-1){
        System.out.println("stack is empty");
    }
    else{
        num = stack[top];
        top--;
        System.out.println("Popped element: " + num);
    }
}
    public void display(){
        if(top==-1){
            System.out.println("stack is empty");
        }
        else{
            System.out.print("Stack elements: ");
            for(int i=0; i<=top; i++){
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

}