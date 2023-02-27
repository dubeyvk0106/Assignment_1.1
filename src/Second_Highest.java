import java.util.*;

public class Second_Highest {

    static void secondLargest(int arr[],
                              int size)
    {
        int i, first, second;
        if (size < 2)
        {
            System.out.printf(" Invalid Input ");
            return;
        }

        Arrays.sort(arr);

        System.out.println("Second highest element is :" + arr[size-2]);

    }

    public static void main(String[] args){

        int arr[] = {10, 45, 17, 15, 74, 13};
        int n = arr.length;
        secondLargest(arr, n);
    }

}
