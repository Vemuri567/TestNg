package MainClasses.Methods;

import Methods.Methods_WithParameters;
import Methods.Methods_WithReturnType;

public class MainRUnner {
    public static void main(String[] args) {
        Methods_WithParameters obj=new Methods_WithParameters();
        System.out.println(obj.add(2,3));
        obj.add(4,5);
        Methods_WithParameters.sub(3,2);
        Methods_WithReturnType obj1=new Methods_WithReturnType();
        System.out.println(obj1.verifyuser("xyz","xxxx"));
    }
}
