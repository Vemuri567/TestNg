package BasicPractice;

public class Returnmethod
{
    public int multiply()
    {
        int a=356;
        int b=765;
        return (b-a);
    }
    public static void main(String[] args)
    {
        Returnmethod obj=new Returnmethod();
        int c=obj.multiply();
        System.out.println(c);
    }
}
