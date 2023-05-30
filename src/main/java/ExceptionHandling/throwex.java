package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class throwex {
    public static void main(String[] args) throws IOException,ArrayIndexOutOfBoundsException,ArithmeticException
    {
        String data=null;
        FileInputStream fs=new FileInputStream("");
        fs.read();
        int[] a={1,2,3};
        int value=a[2];
        int value1=value/0;
        if(data==null)
        {
            throw new ApplicationException("data is null");
        }
    }

}
