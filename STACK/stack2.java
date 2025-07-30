package STACK;

public class stack2 {
    public static void main(String[] args) {
        
    }
}
public  class MyStack{
    int stack[];
    int size;
    int top;
 public MyStack(int Stacksize){
    stack=new int[Stacksize];
size=Stacksize;
    top=-1;
 }

 
void push(int num){
    if(top>=size-1){
        System.out.println("Stack is full");
    }
    else{
        top++;
        stack[top]=num;
    }
   
}
}