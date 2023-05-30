package Constructor;

public class ConstructorProgram {

    int a;
    int b;

    public ConstructorProgram(int a,int b)
    {
        this.a=a;
        this.b=b;
    }

    public void add()
    {
        int sum=a+b;
        System.out.println(sum);
    }
}
