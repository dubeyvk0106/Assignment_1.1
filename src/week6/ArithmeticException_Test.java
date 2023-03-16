package week6;

public class ArithmeticException_Test extends Exception {

    public static void main(String args[])
    {
        int a =100, b = 0;
        int c;

        try
        {
            c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println( "The exception occurred is as follows " + e.getMessage() );
        }

    }
}
