package week6;

import java.io.*;


public class WriteToAFile {

    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter("newfile.txt",true);

            fileWriter.write("\nLearning file handling in java");
            fileWriter.write("\nLearning file handling in java");
            fileWriter.write("\nLearning file handling in java");
            fileWriter.write("\nLearning file handling in java");
            //fileWriter.write("Learning file handling in java from basics");


            fileWriter.close();
            System.out.println("Write operation is successful");
        } catch (IOException e) {
            System.out.println("an Unexpected error has occurred, please try again !!");
            e.printStackTrace();
        }
    }
}
