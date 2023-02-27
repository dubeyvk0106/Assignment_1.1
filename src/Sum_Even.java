import java.util.*;

public class Sum_Even {

    private static Scanner input;
    public static void main(String[] args)
    {
        int Size, i, sumEven = 0;
        input = new Scanner(System.in);

        System.out.print(" Please Enter Number size of  array : ");
        Size = input.nextInt();

        int [] arr = new int[Size];

        System.out.print(" Please Enter " + Size + " elements of an Array  : ");
        for (i = 0; i < Size; i++)
        {
            arr[i] = input.nextInt();
        }

        for(i = 0; i < Size; i++)
        {
            if(arr[i] % 2 == 0)
            {
                sumEven = sumEven + arr[i];
            }
        }
        System.out.println("\n The Sum of Even Numbers in this Array = " + sumEven);
    }
}
