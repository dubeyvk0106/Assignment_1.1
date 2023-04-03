package week7;
import java.util.*;

public class MenuProgram {

    public static void main(String[] args) {

        int choice;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        do {
            System.out.println("\n Menu for the Selection of your choice ");
            System.out.println("1. Add element to the list of options available");
            System.out.println("2. Remove an element of your choice from the menu");
            System.out.println("3. View/Display elements available in the menu");
            System.out.println("4. Exit from the system !!");
            System.out.print("Enter your Choice based on your need or wish : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of elements to add: ");
                    int k = scanner.nextInt();
                    for (int j = 0; j < k; j++) {
                        System.out.print("Enter choice " + (j+1) + ": ");
                        String eoc = scanner.next();
                        list.add(eoc);
                    }
                    break;
                case 2:
                    System.out.print("Enter your choice to remove: ");
                    String eoc = scanner.next();
                    if (list.remove(String.valueOf(eoc))) {
                        System.out.println("Successfully removed.");
                    } else {
                        System.out.println("Entered choice has not been found.");
                    }
                    break;
                case 3:
                    System.out.println("Choices available: " + list);
                    break;
                case 4:
                    System.out.println("System has successfully exited");
                    break;
                default:
                    System.out.println("You have entered an invalid option. Please enter valid one !!");
                    break;
            }

        } while (choice != 4);

        // close the scanner object
        scanner.close();
    }



}
