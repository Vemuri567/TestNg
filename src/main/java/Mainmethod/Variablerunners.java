package Mainmethod;

import Variables2.Nonstatic;
import Variables2.Static;

public class Variablerunners
{
    public static void main(String[] args) {
        Nonstatic obj=new Nonstatic();
        int q= obj.agenuber1;
        System.out.println(q);
        int w= Static.agenumber;
        System.out.println(w);
    }
}
