import java.util.*;

//Write a Java program to validate a personal identification number (PIN). Assume the length of a PIN number is 3, 5 or 7.

public class Input_Validation {

    public static boolean valid(String n) {
        return n.matches("\\d{3}|\\d{5}|\\d{7}");
    }


    public static void main(String[] args){

        Scanner input= new Scanner(System.in);
        System.out.println("Enter PIN Number: ");
        String str = input.nextLine();

        System.out.println("Is the said PIN number is valid? "+valid(str));
    }
}
