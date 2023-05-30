package Abstraction;

public abstract class A {
    static int c=10;
    int d=10;
    public A(int c)
    {
        this.c=c;
    }
    public abstract void add(int a,int b);
    public void sub(int a,int b)
    {
        System.out.println(a-b+d);
    }
    public  void multiplication(int a,int b){
        System.out.println(a*b*c);
    }
}
