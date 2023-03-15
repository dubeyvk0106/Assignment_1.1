package week6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) throws IOException
    {

        int chars;


        FileReader  fileReader=null;
        try
        {
            fileReader = new FileReader("output.txt");
        }
        catch (FileNotFoundException fe)
        {
            System.out.println("Mentioned File does not exist");
        }


        while ((chars= fileReader.read())!=-1)
            System.out.print((char)chars);


        fileReader.close();
    }
}
