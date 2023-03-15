package week6;
import java.io.*;

public class ArithmeticException {

    public static void main(String args[])
    {
        int a =100, b = 0;
        int c;

        try
        {
            c = a/b;
            System.out.println(c);
        }
        catch(Throwable e)
        {
            System.out.println( "The exception occurred is as follows " + e.getMessage() );
        }

    }
}
