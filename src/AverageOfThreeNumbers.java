import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        System.out.print("Input the first number: ");
        double a = input.nextDouble();
        System.out.print("Input the second number: ");
        double b = input.nextDouble();
        System.out.print("Input the third number: ");
        double c = input.nextDouble();

        double average = (a+b+c)/3;
        System.out.print("Average of three numbers is : " + average);
    }
}
