import java.util.*;

public class ChangeCurrency {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Type 1 for Rs to $ conversion: ");
        System.out.println("Type 2 for $ to Rs conversion: ");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter rupee amount: ");
                double rupees_1 = input.nextDouble();
                double dollar_1 = rupees_1 / 82.78;
                System.out.println(rupees_1 + " rupees => " + dollar_1 + " dollars");
                break;

            case 2:
                System.out.print("Enter dollar amount: ");
                double dollar_2 = input.nextDouble();
                double rupees_2 = dollar_2 * 82.78;
                System.out.println(dollar_2 + " dollars => " + rupees_2 + " rupees");
                break;

            default:
                System.out.println("Incorrect Choice");
        }
    }
}
