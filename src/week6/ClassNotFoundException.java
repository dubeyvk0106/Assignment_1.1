package week6;

public class ClassNotFoundException {
    public static void main(String[] args) {
        try{
            Class c = Class.forName("RandomClass");   // Class1 is not defined
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("Class Mentioned is Not Found...");
        }
    }
}