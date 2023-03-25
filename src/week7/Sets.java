package week7;
import java.util.*;
import java.io.*;


public class Sets {

    public static void main(String[] args){

        int count = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        HashSet<Integer> hashSet = new HashSet<Integer>();

        while(count <= 10){

            int a = sc.nextInt();
            hashSet.add(a);
            count++;
        }


        for(int b : hashSet){
            arrayList.add(b);
        }

        System.out.println("The unique arraylist is : " + arrayList);

    }
}

