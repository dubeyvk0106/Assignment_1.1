package week7;
import java.io.*;

class Practice implements java.io.Serializable
{
    public int age;
    public String name;
    public String email_id;

    public Practice(int a, String b, String c)
    {
        this.age = a;
        this.name = b;
        this.email_id = c;
    }
}

public class Serialization_Demo {

    public static void main(String[] args) {
        Practice object = new Practice(1, "geeksforgeeks", "dubeyvk0106@gmail.com");
        String filename = "vivek.ser";

        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(object);
            out.close();
            file.close();
            System.out.println("Object is serialized");

        }
        catch (IOException ex) {
            System.out.println("An IOException has been caught");
        }

    }
}
