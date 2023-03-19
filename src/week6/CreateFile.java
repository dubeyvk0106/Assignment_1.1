package week6;

import java.io.*;

public class CreateFile {

    public static void main(String args[]) {
        try {

            File file = new File("newfile.txt");
            if (file.createNewFile()) {
                System.out.println("File " + file.getName() + " has been created successfully.");
            } else {
                System.out.println("File already exists in the mentioned directory.");
            }
        } catch (IOException exception) {
            System.out.println("An unexpected error is occurred. Please try again !!");
            exception.printStackTrace();
        }
    }
}


