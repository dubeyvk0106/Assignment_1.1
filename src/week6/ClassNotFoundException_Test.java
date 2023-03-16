package week6;

public class ClassNotFoundException_Test extends Exception {
    public static void main(String[] args) {
        try{
            Class c = Class.forName("RandomClass");
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
            System.out.println("Class Mentioned is Not Found...");
        }
    }
}
