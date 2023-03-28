package week7;
import java.io.*;
import java.util.*;

public class ReverseFirstKElementsInQueue {

    static Queue<Integer> reverse(Queue<Integer> queue, int k) {
        function(queue, k);
        int t = queue.size() - k;
        while( t-- > 0){
            int x = queue.poll();
            queue.add(x);
        }
        return queue;
    }

    static void function(Queue<Integer> queue, int k){
        if(k == 0) return;
        int front = queue.poll();
        function(queue, k - 1);
        queue.add(front);
    }

    public static void main (String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 8 integers in queue:");

        while(count<8){
            int a = sc.nextInt();
            queue.add(a);
            count++;
        }

        int k = 0;

        do{
            System.out.println("Enter a number less than 8:");
             k = sc.nextInt();
            if(k<=8)
                break;
        }while(true);

        queue = reverse(queue, k);
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }


}
