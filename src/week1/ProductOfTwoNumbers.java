package week1;

import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args){
        {
            Scanner input = new Scanner (System.in);
            System.out.print("Input the first number: ");
            double t = input.nextDouble();
            System.out.print("Input the second number: ");
            double u = input.nextDouble();
            double v = (t*u);
            System.out.println();
            System.out.println("The multiplication of two numbers is:" +v);
        }
    }
}
