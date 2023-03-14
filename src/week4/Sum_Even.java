package week4;

import java.util.*;

public class Sum_Even {


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n, j, sumEven = 0;


        System.out.print(" Please Enter size of the array you want sum of : ");
        n = input.nextInt();

        int [] arr = new int[n];

        System.out.print(" Please Enter " + n + " elements of an the Array  : ");
        for (j = 0; j < n; j++)
        {
            arr[j] = input.nextInt();
        }

        for(j = 0; j < n; j++)
        {
            if(arr[j] % 2 == 0)
            {
                sumEven = sumEven + arr[j];
            }
        }
        System.out.println(" The Sum of Even Numbers in the provided array = " + sumEven);
    }
}
