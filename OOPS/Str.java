package OOPS;

public class Str {
    public static void main(String[] args) {
        String name="hello is my name";
        int count=0;
        int i=1;
     while(i<=name.length()){
        if(name==" "){
          count=0;
        }
        else{
            count++;
        }
        System.out.println(count);
        i++;
    }
}

}