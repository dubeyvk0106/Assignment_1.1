package week6;

import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {

    public static void main(String[] args) throws IOException
    {

        String str = "File Handling in Java with the help of "+
                " FileWriter and FileReader" +
                " For practice purpose";


        FileWriter fileWriter=new FileWriter("output.txt");


        for (int j= 0; j < str.length(); j++)
            fileWriter.write(str.charAt(j));

        System.out.println("Writing to the file was successful");

        fileWriter.close();
    }
}
