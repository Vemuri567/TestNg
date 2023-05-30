package AccessModifiers;

public class PrivateAccessModifier {
    private int a=10;
    private int add(int b){
        int c=a+b;
        return c;
    }
    public int addition(int b)
    {
        return add(b);
    }
}
