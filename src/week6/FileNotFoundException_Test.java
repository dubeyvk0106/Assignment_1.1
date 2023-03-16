package week6;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;

 class FileNotFoundException_Test extends Exception {


        public static void main(String args[]) {


            {
                try {

                    File file = new File("E://file.txt");

                    FileReader fileReader = new FileReader(file);
                } catch (FileNotFoundException e) {
                    System.out.println("File mentioned does not exist");
                }

                try {

                    // following file exists so it does not go into the catch block
                    File file = new File("output.txt");

                    System.out.println("File mentioned exist and can be opened...");

                    FileReader fileReader = new FileReader(file);
                } catch (FileNotFoundException e) {
                    System.out.println("File mentioned does not exist");
                }


            }

        }
    }


