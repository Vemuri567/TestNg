package ExceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        String browser=null;
        if(browser==null)
        {
            try
            {
                throw new Exception("browser not found");
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
        else {
            System.out.println("browser name:chrome");
        }
        int result=30;
        System.out.println(result);
    }
}
