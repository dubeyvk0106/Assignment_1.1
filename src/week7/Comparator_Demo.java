package week7;
import java.io.*;
import java.lang.*;
import java.util.*;

class Student {

    int rollno;
    String name;
    String address;

    public Student(int roll, String name, String address)
    {
        this.rollno = roll;
        this.name = name;
        this.address = address;
    }

    public String toString()
    {

        return this.rollno + " " + this.name + " "
                + this.address;
    }
}

class SortOnBasisOfRoll implements Comparator<Student> {

    public int compare(Student p, Student q)
    {

        return p.rollno - q.rollno;
    }
}

public class Comparator_Demo {

    public static void main(String[] args)
    {

        ArrayList<Student> arrayList = new ArrayList<Student>();


        arrayList.add(new Student(100, "Vivek", "UP"));
        arrayList.add(new Student(95, "Rajan", "MP"));
        arrayList.add(new Student(90, "Rahul", "MH"));

        System.out.println("Unsorted list of students : ");

        for (int j = 0; j < arrayList.size(); j++)
            System.out.println(arrayList.get(j));

        Collections.sort(arrayList, new SortOnBasisOfRoll());
        System.out.println("\nSorted list of students by rollno : ");
        for (int i = 0; i < arrayList.size(); i++)
            System.out.println(arrayList.get(i));

    }


}
