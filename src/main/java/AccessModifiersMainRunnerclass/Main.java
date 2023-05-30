package AccessModifiersMainRunnerclass;

import AccessModifiers.PrivateAccessModifier;
import AccessModifiers.ProtectedAccessModifier;
import AccessModifiers.PublicAccessModifier;

public class Main {
    public static void main(String[] args) {
        PublicAccessModifier obj=new PublicAccessModifier();
        int result=obj.add(10);
        PrivateAccessModifier obj1=new PrivateAccessModifier();
        int result2=obj1.addition(20);

    }
}
