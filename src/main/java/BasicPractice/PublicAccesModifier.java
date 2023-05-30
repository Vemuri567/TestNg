package BasicPractice;

public class PublicAccesModifier
{
    //****Basic Method declaration without parameters:AccessModifier returntype methodname();***
    //***() - method brackets
    public void publicMethod()  //method declaration
    {
        //Method body
        String name="Naveen";
        System.out.println(name);
    }
    public void output()
    {
        System.out.println("saif");
    }

    public static void main(String[] args)
    {
       //***object creation syntax---- Classname obj=new Classname();-----***
        PublicAccesModifier obj=new  PublicAccesModifier();
        obj.publicMethod();
        obj.output();
    }

}
