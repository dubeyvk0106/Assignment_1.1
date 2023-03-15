package week6;

import java.io.*;

public class ArrayIndexOutOfBound {

    public static void main(String args[]) {
        try {
            int a[] = new int[5];
            System.out.println("Access element placed at position six :" + a[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown is as follows  :" + e.getMessage());
        }
        System.out.println("We have come out of the block");
    }
}
