package week6;

import java.util.Scanner;

public class IOException {

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);


        System.out.println("" + scanner.nextLine());

        System.out.println("Exception is as follows: "
                + scanner.ioException());

        scanner.close();
    }
}
