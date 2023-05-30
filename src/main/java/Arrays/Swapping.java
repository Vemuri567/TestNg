package Arrays;

public class Swapping {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        //**swapping of 2 no's using third variable**
        /*int c;
        c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);*/
        //swapping of 2 no's without third variable
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
