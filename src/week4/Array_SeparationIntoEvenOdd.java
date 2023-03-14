package week4;

import java.util.*;

public class Array_SeparationIntoEvenOdd {


    public static void print(int[] array)
    {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.print(" Please Enter Number size of  array : ");
        int Size = input.nextInt();

        int [] arr = new int[Size];

        System.out.print(" Please Enter " + Size + " elements of an Array  : ");
        for (int i = 0; i < Size; i++)
        {
            arr[i] = input.nextInt();
        }

        int evenSize = 0;
        int oddSize = 0;
        for (int i = 0; i < Size; i++) {
            if (arr[i] % 2 == 0)
                evenSize++;
            else
                oddSize++;
        }

        int[] even = new int[evenSize];
        int[] odd = new int[oddSize];

        int j = 0, k = 0;
        for (int i = 0; i < Size; i++) {
            if (arr[i] % 2 == 0)
                even[j++] = arr[i];
            else
                odd[k++] = arr[i];
        }
        System.out.print("Even Array contains: ");
        print(even);
        System.out.print("Odd Array contains: ");
        print(odd);
    }
}
