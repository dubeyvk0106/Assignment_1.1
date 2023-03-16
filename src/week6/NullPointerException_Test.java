package week6;

public class NullPointerException_Test extends Exception {

    public static void main(String args[])
    {
        try {
            String b = null;
            System.out.println(b.charAt(0));
        } catch(NullPointerException e) {
            System.out.println("Exception occurred is as follows : " + e.getMessage());
        }

    }
}
