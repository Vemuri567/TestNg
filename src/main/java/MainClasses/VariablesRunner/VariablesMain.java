package MainClasses.VariablesRunner;

import Variables.NonStaticVariables;
import Variables.StaticVariables;

public class VariablesMain
{
    public static void main(String[] args)
    {
        //ObJect Syntax
        //ClassName obj=new ClassName()
        NonStaticVariables obj=new NonStaticVariables();
        //datatype variable=value;
        int agevariable=obj.age;
        System.out.println(agevariable);
        //if it is a static vraible no need to create object for that class
        //retrieve the variable by using ClassName.variable
        int age2=StaticVariables.age1;
        System.out.println(age2);

    }
}
