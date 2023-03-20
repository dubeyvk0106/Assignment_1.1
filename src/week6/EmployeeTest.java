

// Vivek Dubey NIT Raipur

package week6;
import java.io.*;
import java.util.*;

class Employee {

    double salary;
    int age;
    int id;
    String name;

    Employee(String name, int id, int age, double salary) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.salary = salary;
    }

    public String toString() {
        return "Name: " + name + "\nID: " + id + "\nAge: " + age + "\nSalary: " + salary+"\n-----------------------------";
    }
}

class Manage {
    String filename;

    Manage(String filename) {
        this.filename = filename;
    }

    void addEmployee(Employee employee) throws IOException {
        FileWriter fileWriter = new FileWriter(filename, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        printWriter.println(employee.name + "," + employee.id + "," + employee.age + "," + employee.salary);

        printWriter.close();
        fileWriter.close();
    }

    Employee searchEmployee(int id) throws IOException {
        FileReader fileReader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String oneLine;
        while ((oneLine = bufferedReader.readLine()) != null) {
            String[] sections = oneLine.split(",");
            int Id = Integer.parseInt(sections[1]);
            if (Id == id) {
                String name = sections[0];
                int age = Integer.parseInt(sections[2]);
                double salary = Double.parseDouble(sections[3]);
                return new Employee(name, id, age, salary);
            }
        }

        bufferedReader.close();
        fileReader.close();

        return null;
    }

    void viewEmployees() throws IOException {
        FileReader fileReader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String oneLine;
        while ((oneLine = bufferedReader.readLine()) != null) {
            String[] sections = oneLine.split(",");
            String name = sections[0];
            int id = Integer.parseInt(sections[1]);
            int age = Integer.parseInt(sections[2]);
            double salary = Double.parseDouble(sections[3]);
            System.out.println(new Employee(name, id, age, salary));
        }

        bufferedReader.close();
        fileReader.close();
    }

    static void deleteEmployee(Scanner sc) throws IOException{

        System.out.println("Enter id which you want to delete.");
        String id = sc.next();
        boolean empIDFound = false;
        File tempFile = new File("temp_employee.txt");
        File origFile = new File("vivek.txt");

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(tempFile));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(origFile));

        String oneLine;
        try{
            while((oneLine = bufferedReader.readLine()) !=null){

                String[] data = oneLine.split(",");
                String empID =data[1];
                if(empID.equals(id)){
                    System.out.println("Found");
                    empIDFound = true;
                    continue;
                }
                bufferedWriter.write(oneLine);
                bufferedWriter.newLine();


            }
            bufferedWriter.close();
            bufferedReader.close();

            if(origFile.exists()){
                origFile.delete();

            }

            tempFile.renameTo(origFile);
            if(empIDFound){
                System.out.println("Deleted successfully.");
            }
            else{
                System.out.println("Data not found");
            }
        }
        catch(FileNotFoundException e){
            System.out.println("An error has occurred.File not found.");
            e.printStackTrace();
        }

    }


}


public class  EmployeeTest {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the file :");
        String filename = sc.nextLine();

        Manage manageEmployee = new Manage(filename);

        while (true) {
            System.out.println("\n1. Add Employee you want to add into the list.");
            System.out.println("\n2. Search Employee which you want to see details of.");
            System.out.println("\n3. View details of all the Employees present in the database.");
            System.out.println("\n4. Delete an entry from the database. \n");
            System.out.println("\n5. Exit from EMS. \n");
            System.out.print("\nEnter Your Choice based on what you want to do. : ");

            int choice = sc.nextInt();

            if (choice == 1) {
                sc.nextLine();
                System.out.println("Enter name of the employee which needs to be added:");
                String name = sc.nextLine();

                System.out.println("Enter ID of the Employee:");
                int id = sc.nextInt();

                System.out.println("Enter age of the Employee:");
                int age = sc.nextInt();

                System.out.println("Enter salary for the Employee:");
                double salary = sc.nextDouble();

                manageEmployee.addEmployee(new Employee(name, id, age, salary));
            } else if (choice == 2) {
                System.out.println("Enter ID of the Employee for search:");
                int id = sc.nextInt();

                Employee employee = manageEmployee.searchEmployee(id);

                if (employee == null) {
                    System.out.println("Employee ID which you have entered does not match with any existing record.");
                } else {
                    System.out.println(employee);
                }
            } else if (choice == 3) {
                manageEmployee.viewEmployees();
            } else if (choice == 4) {

                Manage.deleteEmployee(sc);
                break;
            } else if(choice == 5){
                break;
            } else{
                System.out.println("Invalid option !! Please choose options from given in list. ");
            }
        }
    }
}


