package Polymorphism;

public class Main {


    public static void main(String[] args) {
        B obj=new B();
        obj.add(10,20);
        A obj1=new B();
        obj1.add(10,20);
        A obj2=new B();
        obj2.add(10,30);
    }
}
