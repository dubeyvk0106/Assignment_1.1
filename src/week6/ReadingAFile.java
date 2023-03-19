package week6;
import java.util.*;
import java.io.*;
public class ReadingAFile {


    public static void main(String[] args) {
        try {

            File file = new File("newfile.txt");
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                String fileContent = fileReader.nextLine();
                System.out.println(fileContent);
            }
            fileReader.close();
        } catch (FileNotFoundException exception) {
            System.out.println("An error has occurred!");
            exception.printStackTrace();
        }
    }

}
