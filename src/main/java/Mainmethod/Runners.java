package Mainmethod;

import Variables2.Nonstatics;
import Variables2.Statics;

public class Runners {
    public static void main(String[] args) {
        Nonstatics obj = new Nonstatics();
        String s = obj.name;
        System.out.println(s);
        String f = Statics.name;
    }
}
