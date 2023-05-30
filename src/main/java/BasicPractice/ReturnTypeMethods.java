package BasicPractice;

public class ReturnTypeMethods
{
    //**without returning value***//
    public void add()
    {
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c);

    }
    /*
    public void add30and40()
    {
        int a=30;
        int b=40;
        int c=a+b;
        System.out.println(c);
    }
*/
    //returnning a value
    public int addition()
    {
        int a=10;
        int b=20;
        int c=a+b;
        return c;

    }

    //** method with parameters***//

    public int paramAddition(int a,int b)
    {
        int c=a+b;
        return  c;
    }

    public void multiply()
    {
        int a=10;
        int b=20;
        int c=a*b;
        System.out.println(c);
    }

    public  void sub()
    {
        int a=20;
        int b=10;
        int c=a-b;
        System.out.println(c);
    }

    public static void main(String[] args)
    {
        ReturnTypeMethods obj=new ReturnTypeMethods();
        //return type with void
        obj.add();
        //***Variable saving syntax:Datatype variable=value;***/
        int d=obj.addition();
        int e=d*20;
        System.out.println(e);

        //** calling parameterization method***//

        int g=obj.paramAddition(30,40);
        System.out.println(g);
        int f=obj.paramAddition(70,30);
        System.out.println(f);

    }

}
