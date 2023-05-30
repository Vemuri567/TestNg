package Inheritence;

public class BaseClass {
    int a;
    int b;
    public  BaseClass(int a,int b){
        this.a=a;
        this.b=b;
    }

    public int Baseproperties()
    {
        int sum=a+b;
        return sum;
    }
    public void sub()
    {
        int sub=a-b;
        System.out.println(sub);
    }
}
