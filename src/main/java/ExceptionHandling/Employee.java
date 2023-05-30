package ExceptionHandling;

public class Employee {
    String name;

    public static void main(String[] args) {
        System.out.println("A");
        System.out.println("B");
        System.out.println("A");
        try
        {
            Employee obj=new Employee();
            obj=null;
            obj.name="Naveen";
            int i=9/0;
            System.out.println("hello");
        }

        catch (NullPointerException ex)
        {
            ex.printStackTrace();
        }
        catch (ArithmeticException ex)
        {
            ex.printStackTrace();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        System.out.println("hello");
        System.out.println("bye");
    }
}
