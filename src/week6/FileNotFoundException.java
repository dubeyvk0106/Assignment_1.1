package week6;

import java.io.File;

import java.io.FileReader;

 class FileNotFoundException {


        public static void main(String args[]) {


            try {
                File file = new File("D://file.txt");

                FileReader fileReader = new FileReader(file);
            } catch (Exception e) {
                System.out.println("Specified File does not exist");
            }

            try {
                // following file exists so it does not go into catch block
                File file = new File("output.txt");

                System.out.println("Specified File exist");

                FileReader fileReader = new FileReader(file);
            } catch (Exception e) {
                System.out.println("Specified File does not exist");
            }

        }
    }


