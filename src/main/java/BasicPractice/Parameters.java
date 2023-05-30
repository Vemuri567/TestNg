package BasicPractice;

public class Parameters
{
    public int add(int a,int b)
    {
        int c=a+b;
        return c;
    }

    public static void main(String[] args)
    {
        Parameters obj=new Parameters();
        int c=obj.add(12,48);
        System.out.println(c);
    }
}
