package Statements;

public class Studentmarks {
    public int EvenoddStatements()
    {
        int t=76;
        if(t<35)
        {
            System.out.println("fail");
        }
        else if (t==35)
        {
            System.out.println("just pass");
        }
        else if (t>35 && t<60)
        {
            System.out.println("third class");
        } else if (t>60 && t<75)
        {
            System.out.println("Second class");
        }
        else if (t>75 && t<85)
        {
            System.out.println("first class");
        } else if (t<=100)
        {
            System.out.println("distinction");
        }
        return t;
    }
}
