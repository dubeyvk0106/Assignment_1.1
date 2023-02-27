import java.util.Scanner;

public class Simple_Compound {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principal: ");
        double principal = input.nextDouble();

        System.out.println("Enter the time: ");
        double time = input.nextDouble();

        System.out.println("Enter the rate: ");
        double rate = input.nextDouble();

        System.out.println("Enter number of times interest is compounded: ");
        int noOfTimesToCompound = input.nextInt();

        double simpleInterest = (principal * time * rate) / 100;
        double compoundInterest = principal * (Math.pow((1 + rate / 100), (time * noOfTimesToCompound))) - principal;

        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Compound Interest: " + compoundInterest);

        input.close();
    }

}
