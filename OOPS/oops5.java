package OOPS;


class oops5{
    int a;
    float b;
    String c;
    private  oops5(){
a=10;
b=23.56f;
c="ronak";
    }
    void pridsp(){
        System.out.println(a+" "+b+" "+c);
    }
    public static void main(String[] args) {
    oops5 priref=new oops5();
    priref.pridsp();
    }
}