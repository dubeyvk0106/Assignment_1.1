package week7;
import java.io.*;

public class DeSerialization {

    public static void main(String[] args){

        Practice object_1 = null;

        try
        {

            FileInputStream file = new FileInputStream("vivek.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(file);


            object_1 = (Practice) objectInputStream.readObject();

            objectInputStream.close();
            file.close();

            System.out.println("Object is deserialized ");
            System.out.println("age = " + object_1.age);
            System.out.println("name = " + object_1.name);
            System.out.println("email-id = " + object_1.email_id);
        }

        catch(IOException ex)
        {
            System.out.println("An IOException has been caught");
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("A ClassNotFoundException has been caught");
        }
    }
}
