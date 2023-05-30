package Abstraction;

public class B extends A{

    int c;
    public B(int c) {
        super(c);
        this.c=c;
    }


    public void add(int a,int b) {
        d=20;
        c=10;
        System.out.println(a+b+c+d);
    }
    public void div(int a,int b) {
        System.out.println(a/b/c);
    }


}
