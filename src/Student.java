import java.util.*;

public class Student {

        int rollNumber;
        String name;
        String course;
        int marks1;
        int marks2;
        int marks3;


    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getMarks1() {
        return marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public int calculateTotal(int marks1, int marks2, int marks3){
        return marks1 + marks2 + marks3;
    }

    public double calculateAverage(int marks1, int marks2, int marks3){
        return (marks1 + marks2 + marks3)/3;
    }

    public char calculateGrade(int marks1, int marks2, int marks3){
        int total = marks1 + marks2 + marks3;
        if(total >= 270)
            return 'A';
        else if(240 <= total && total < 270)
            return 'B';
        else if (210 <= total && total < 240)
            return 'C';
        else if(180 <= total && total < 210)
            return 'D';
        else
            return 'E';
    }

    public String toString(){
        return name +" "+ rollNumber +" "+ marks1+" " + marks2 +" "+ marks3;
    }
}

 class StudentTest{

    public static void main (String args[]){

        // creating the five instances of the student class
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();

        s1.setName("Rajan");
        s1.setRollNumber(0000);
        s1.setCourse("CSE");
        s1.setMarks1(95);
        s1.setMarks2(78);
        s1.setMarks3(72);

        s2.setName("Rahul");
        s2.setRollNumber(0001);
        s2.setCourse("CSE");
        s2.setMarks1(58);
        s2.setMarks2(75);
        s2.setMarks3(79);

        s3.setName("Ram");
        s3.setRollNumber(0002);
        s3.setCourse("CSE");
        s3.setMarks1(85);
        s3.setMarks2(48);
        s3.setMarks3(52);

        s4.setName("Shweta");
        s4.setRollNumber(0003);
        s4.setCourse("CSE");
        s4.setMarks1(50);
        s4.setMarks2(60);
        s4.setMarks3(65);

        s5.setName("Archana");
        s5.setRollNumber(0004);
        s5.setCourse("CSE");
        s5.setMarks1(90);
        s5.setMarks2(93);
        s5.setMarks3(87);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);


        System.out.println("Grade of "+s1.getName()+" is "+s1.calculateGrade(s1.marks1, s1.marks2, s1.marks3));
        System.out.println("Grade of "+s2.getName()+" is "+s2.calculateGrade(s2.marks1, s2.marks2, s2.marks3));
        System.out.println("Grade of "+s3.getName()+" is "+s3.calculateGrade(s3.marks1, s3.marks2, s3.marks3));
        System.out.println("Grade of "+s4.getName()+" is "+s4.calculateGrade(s4.marks1, s4.marks2, s4.marks3));
        System.out.println("Grade of "+s5.getName()+" is "+s5.calculateGrade(s5.marks1, s5.marks2, s5.marks3));








    }

}
