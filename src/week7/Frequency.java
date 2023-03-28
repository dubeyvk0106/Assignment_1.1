package week7;
import java.util.*;
import java.io.*;

public class Frequency {

    public static void main(String[] args){
                ArrayList<Integer> arrayList = new ArrayList<Integer>();
                HashMap<Integer, Integer> map = new HashMap<>();
                Scanner sc = new Scanner(System.in);
                int count = 0;
                while(count<10){
                    int a = sc.nextInt();
                    arrayList.add(a);
                    count++;
                }

                //counting frequencies
                for(int b: arrayList){
                    if(map.containsKey(b)){
                        map.put(b,map.get(b)+1);
                    }
                    else
                        map.put(b,1);
                }

                for(Map.Entry<Integer,Integer> s: map.entrySet()){
                    System.out.println("Key: " + s.getKey()
                            + " Value: " + s.getValue());
                }

    }
}
