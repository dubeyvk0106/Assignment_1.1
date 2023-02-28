import java.util.*;

public class Second_Highest {



    static void secondLargest(int arr[], int n)
    {

        if (n < 2)
        {
            System.out.println(" Second highest number program requires at least two numbers...  ");
            return;
        }

        Arrays.sort(arr);

        System.out.println("Second highest element is :" + arr[n-2]);

    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println(" Please Enter Number size of  array : ");
        int Size;
        Size = input.nextInt();
        int i;

        int [] arr = new int[Size];

        System.out.print(" Please Enter " + Size + " elements of an Array  : ");
        for ( i = 0; i < Size; i++)
        {
            arr[i] = input.nextInt();
        }

        secondLargest(arr, Size);
    }

}
