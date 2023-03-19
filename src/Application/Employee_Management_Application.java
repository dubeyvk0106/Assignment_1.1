package Application;

import java.io.*;
import java.util.*;



    class Employee implements Serializable{

        float salary;
        String name;
        String email_id;
        long contact_no;
        int id;

        public Employee(int id,String name,float salary,long contact_no, String email_id){


            this.id = id;
            this.name = name;
            this.salary = salary;
            this.contact_no = contact_no;
            this.email_id = email_id;
        }

        public String toString()
        {
            return "\nDetails of Employee :" + "\nID:" + this.id + "\nName :" + this.name +
                     "\nSalary :" + this.salary + "\nContact No :" + this.contact_no +
                    "\nEmail ID :" + this.email_id;

        }

    }
public class Employee_Management_Application {

        static void view(ArrayList<Employee> arrayList)
        {
            System.out.println("\n               ________List of Employees___________");
            System.out.println(String.format("%-10s%-15s%-10s%-20s%-10s","ID","Name","Salary","Contact NO","Email_ID"));

            for(Employee emp : arrayList){

                System.out.println(String.format("%-5s%-20s%-10s%-15s%-10s",emp.id,emp.name,emp.salary,emp.contact_no,emp.email_id));
            }
        }

        public static void main(String [] args){
            String name;
            int id;
            String email_id;
            long contact_no;
            float salary;

            Scanner scanner = new Scanner(System.in);
            ArrayList<Employee> arrayList = new ArrayList<>();

            //File file = null;
            FileOutputStream file = null;
            ObjectOutputStream objectOutputStream = null;
            FileInputStream fileInputStream = null;
            ObjectInputStream objectInputStream = null;

            try{

                 file = new FileOutputStream("abcde.ser");
                fileInputStream = new FileInputStream("abcd.ser");
                objectInputStream = new ObjectInputStream(fileInputStream);

                arrayList =  (ArrayList<Employee>)objectInputStream.readObject();
               // readStream.close();






                //file = new File("C:\\Users\\Vivek Dubey\\IdeaProjects\\Assignment_1\\src\\EmployeeDetails.txt");

                //if(file.exists()){
                 //   fileInputStream = new FileInputStream(file);
                 //   objectInputStream = new ObjectInputStream(fileInputStream);
                 //   arrayList = (ArrayList<Employee>) objectInputStream.readObject();
               // }

            }
            catch (Exception e){
                System.out.println(e);

            }

            do{
                System.out.println("\n___________Welcome to The EMS___________");
                System.out.println("1) Search for required Employee in the database\n"+
                                    "2)Add Employee to the database\n"+
                                    "3)Edit the details of any Employee\n"+
                                    "4)Delete the details of an Employee\n"+
                                    "5)Print or View all working employees\n"+
                                    "6)Exit from the EMS\n");

                System.out.println("Enter choice of yours...");
                int choice = scanner.nextInt();

                switch(choice){
                    case 1:
                        System.out.println("Enter the employee ID to search:\n");
                        id = scanner.nextInt();
                        int j = 0;
                        for(Employee employee: arrayList){
                            if(id == employee.id){
                                System.out.println(employee +"\n");
                                j++;
                            }
                        }
                        if(j==0){
                            System.out.println("\n Enter valid employee ID !!");
                        }
                        break;
                    case 2:
                        System.out.println("Enter the required details to ADD the employee:\n");
                        System.out.println("Enter name:");
                        name = scanner.next();
                        System.out.println("Enter ID of the employee :");
                        id = scanner.nextInt();
                        System.out.println("Enter Contact NO of the employee:");
                        contact_no = scanner.nextLong();
                        System.out.println("Enter email-id of the employee:");
                        email_id = scanner.next();
                        System.out.println("Enter the salary of the employee:");
                        salary = scanner.nextFloat();

                        arrayList.add(new Employee(id,name,salary,contact_no,email_id));
                        view(arrayList);
                        break;
                    case 3:
                        System.out.println("\nEnter the ID of employee you want to edit details of :");
                        id = scanner.nextInt();
                        int k = 0;
                        for(Employee employee: arrayList){
                            if(id == employee.id){

                                k++;
                                do {
                                    int choice_1 = 0;
                                    System.out.println("\nChoose what you want to edit:"+
                                            "1)Employee ID\n" +
                                            "2)Name of employee\n" +
                                            "3)Edit the salary of the employee\n" +
                                            "4)Edit the contact no of the employee\n" +
                                            "5)Edit the email - ID of the employee\n" +
                                            "6)Revert back to previous window\n");
                                    System.out.println("Enter your choice for edit process : ");
                                    choice_1 = scanner.nextInt();
                                    switch(choice_1){
                                        case 1:
                                            System.out.println("\nEnter new EID : ");
                                            employee.id = scanner.nextInt();
                                            System.out.println(employee + "\n");
                                            break;
                                        case 2:
                                            System.out.println("Enter employee's new name : ");
                                            employee.name = scanner.nextLine();
                                            System.out.println(employee + "\n");
                                            break;
                                        case 3:
                                            System.out.println("Enter reformed salary : ");
                                            employee.salary = scanner.nextFloat();
                                            System.out.println(employee + "\n");
                                            break;
                                        case 4:
                                            System.out.println("Enter new contact number : ");
                                            employee.contact_no= scanner.nextLong();
                                            System.out.println(employee + "\n");
                                            break;
                                        case 5:
                                            System.out.println("Enter new email - id of the employee : ");
                                            employee.email_id = scanner.nextLine();
                                            System.out.println(employee + "\n");
                                            break;
                                        case 6:
                                            k++;
                                        default:
                                            System.out.println("Enter a correct choice --Invalid input");
                                            break;
                                    }

                                }
                                while(k==1);

                            }
                        }
                        if(k == 0){
                            System.out.println("Invalid Input !! Please enter valid employee ID");
                        }
                        break;

                    case 4:
                        System.out.println("\nEnter the EID which you want to delete from the database");
                        id = scanner.nextInt();
                        int l = 0;
                        try{
                            for(Employee employee : arrayList){
                                if(employee.id == id){
                                    arrayList.remove(employee);
                                    view(arrayList);
                                    l++;
                                }
                            }
                            if(l==0){
                                System.out.println("Invalid input !! Please enter valid EID");
                            }
                        }
                        catch(Exception exception){
                            System.out.println(exception);
                        }
                        break;

                    case 5:
                        try{
                            arrayList = (ArrayList<Employee>)objectInputStream.readObject();
                        }
                        catch(ClassNotFoundException exception2){
                            System.out.println(exception2);
                        }
                        catch (Exception exception2){
                            System.out.println(exception2);
                        }
                        view(arrayList);
                        break;

                    case 6:
                        try{
                            file = new FileOutputStream("abcde.ser");
                            objectOutputStream = new ObjectOutputStream(file);
                            objectOutputStream.writeObject(arrayList);
                        }
                        catch (IOException exception1){
                            exception1.printStackTrace();
                        }
                        catch (Exception exception2){
                            exception2.printStackTrace();
                        }

                    finally {
                            try{
                                fileInputStream.close();
                                objectInputStream.close();
                                objectOutputStream.close();
                            }
                            catch (Exception exception1){
                                exception1.printStackTrace();
                            }
                        }

                        scanner.close();
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Enter valid choice from the given options !!");
                        break;
                }
            }
            while (true);
        }
}
