package week6;

import java.util.Scanner;

public class IOException_Test extends Exception {

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner("Hi Vivek !!");


        System.out.println("" + scanner.nextLine());

        System.out.println("Exception is as follows: "
                + scanner.ioException());

        scanner.close();
    }
}
