package week7;
import java.util.*;
import java.io.*;
import java.lang.String;

public class FrequencyAlphabet {

    public static void main(String[] args){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = str.toUpperCase();

        // removing whitespaces
        String regex = "\\ ";
        String str2 = str1.replaceAll(regex,"");


        System.out.println(str2);
        char[] charArray = str2.toCharArray();

        for(char c: charArray){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else
                map.put(c,1);
        }

        for(Map.Entry<Character,Integer> s: map.entrySet()){
            System.out.println("Key: " + s.getKey()
                    + " Value: " + s.getValue());
        }

    }
}
