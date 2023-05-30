package Polymorphism;

public class Mathodoverloading {
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }

    public void add(int a,float b)
    {
        System.out.println(a+b);
    }
    public int add(int a,int b,int c)
    {
        return a+b+c;
    }

    public static void main(String[] args) {
        Mathodoverloading obj=new Mathodoverloading();
        obj.add(1,2,3);
    }
}
