package ConditionalStatements;

public class IfClass {
    public static void main(String[] args) {
        int i=10;
        int j=20;
        /** Syntax for if
        /*if(condition)
        {
            statements
        }*/

        if(i==10)
        {
            System.out.println("only if block output :true");
        }

        //**if-else syntax
        /*if(condition)
        {
            statement1
        }
        else
        {
            statements1
        }*/
        if(i==10)
        {
            System.out.println("ifelse blocks output:true");
            if(j==20)
            {
                System.out.println(j);
            }
            else
            {
                System.out.println("j value is not equal to 20");
            }
        }
        else
        {
            System.out.println("ifelse blocks output:false");
        }
        //** syntax for NestedIf
        /*if(condition)
        {

        }
        if(condition)
        {

        }
        if(condition){

        }*/
        if(i==10)
        {
            System.out.println("Nestedifoutput:true");

        }
        else if(i==20)
        {
            System.out.println("Nestedifoutput:false");
        }
        else if(i==30)
        {
            System.out.println("Nestedifoutput:outputshouldnot greaterthan20");
        }
        else
        {
            System.out.println("Nestedifoutput enterd into else block : value not matching");
        }
    }
}
