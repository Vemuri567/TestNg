package Inheritence;

public class ChildClass extends BaseClass
{

    int a;
    int b;
    public ChildClass(int a, int b) {
        super(a, b);
        this.a=a;
        this.b=b;
    }

    public void ChildProperties()
    {
        int basesum=Baseproperties();
        int sum=basesum+a+b;
        System.out.println(sum);
    }
}
