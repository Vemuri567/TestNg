package ExceptionHandling;

public class Student {
    public static int getMarks(String name)
    {
        System.out.println("getting marks for :"+name);

        if(name.equals("Naveen"))
        {
            try
            {
              int i=9/0;
              return i;
            }
            catch (ArithmeticException ex)
            {
                ex.printStackTrace();
                return 80;
            }
            finally {
                System.out.println("print mark sheet");
                return  70;
            }

        }
      else if(name.equals("Syam"))
        {
            return 95;
        }
      else
        {
            return  -1;
        }
    }

    public static void main(String[] args) {
        int m1=getMarks("Naveen");
        System.out.println(m1);
    }
}
