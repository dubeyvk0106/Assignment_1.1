package week6;
import java.io.*;
import java.util.*;


class addition{
    public static void print(int a,int b)
    {
        System.out.println("Addition of Positive Integers :"+(a+b));
    }
}

public class IllegalStateException_Test extends Exception {


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if (n1 >= 0 && n2 >= 0) {
            addition.print(n1, n2);
        } else {
            throw new Exception("Only positive values are allowed ");
        }
    }
}
