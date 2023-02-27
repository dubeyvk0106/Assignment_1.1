import java.util.*;

public class HighestOfThreeNumbers {

    public static void main(String[] args)
    {
        double a, b, c, largest, temp;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number:");
        a = input.nextDouble();
        System.out.println("Enter the second number:");
        b = input.nextDouble();
        System.out.println("Enter the third number:");
        c = input.nextDouble();
        temp=a>b?a:b;

        largest=c>temp?c:temp;

        System.out.println("The largest number is: "+largest);
    }
}
