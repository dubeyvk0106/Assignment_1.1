package week6;

public class NullPointerException extends Throwable {

    public static void main(String args[])
    {
        try {
            String b = null;
            System.out.println(b.charAt(0));
        } catch(Exception e) {
            System.out.println("Exception occurred is as follows : " + e.getMessage());
        }

    }
}
