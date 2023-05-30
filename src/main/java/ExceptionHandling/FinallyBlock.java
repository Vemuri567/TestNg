package ExceptionHandling;

public class FinallyBlock
{
    public static void main(String[] args) {
        System.out.println("hi");
        try
        {
            int i=9/0;
        }

        catch (ArithmeticException ex)
        {
            System.out.println("AE is coming");
            ex.printStackTrace();
        }
        finally
        {
            System.out.println("bye");
        }
    }
}
