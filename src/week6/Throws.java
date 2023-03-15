package week6;

public class Throws {

    static void function() throws IllegalAccessException
    {
        System.out.println("Inside function(). ");
        System.out.println("Checking for throws ");
        throw new IllegalAccessException("e");
    }
    public static void main(String args[])
    {
        try
        {
            function();
        }
        catch(IllegalAccessException e)
        {
            System.out.println("It's been Caught in main function .");
            System.out.println("Successful catch operation. Thanks !!");

        }
    }
}
