import java.io.IOException;
import java.lang.*;
import java.util.*;
import java.io.FileWriter;


public class Main {
    static boolean ordering = true;
    static Timekeeper timekeeper_link = new Timekeeper();
    public static void menu() {
        for (int i = 0; i < 2; i++) {
            System.out.print("**********");
            System.out.print("Welcome to employee management!!");
            System.out.println("**********");
            i++;
        }
     System.out.println("1. Add Employee" + "\n2. View Employee"+ "\n3. Update Employee" +
             "\n4. Delete Employee" + "\n5. View all Employee"+ "\n6. Exit");
    }

    public static void employeelog(String user_name, String user_pass){
        String time = timekeeper_link.timerightnow();
        try{
            FileWriter writer = new FileWriter("credentials.txt", true);
            // true is set in the parameter so that the file won't erase the content
            // when rewritten.
            writer.append("\nUsername: " + user_name+ " Password: "+ user_pass + " Time: "+ time);
            writer.close();
        } catch (IOException e) {
            System.out.println("Error write failed");
        }

    }



    public static void main(String[] args){
        EmployeeService employeeServices_link = new EmployeeService();
        Scanner user_input_scan = new Scanner(System.in);
        Scanner user_name_scan = new Scanner(System.in);
        Scanner user_password_scan = new Scanner(System.in);
        System.out.print("Enter your login ID: ");
        String user_name = user_name_scan.nextLine();
        if(user_name: )
        System.out.print("Enter your password: ");
        String user_password = user_password_scan.nextLine();
        employeelog(user_name, user_password);

        do{
            menu();
            System.out.println("Enter your number of choice: ");
            int choice = user_input_scan.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Add Employee");
                    employeeServices_link.addemployee();
                    System.out.println("New employee list");
                    employeeServices_link.viewallEmployee();
                    break;
                case 2:
                    System.out.println("View Employee");
                    Scanner user_in_scan = new Scanner(System.in);
                    System.out.print("Please enter the desired employee ID: ");
                    int user_in = user_in_scan.nextInt();
                    employeeServices_link.viewEmployee(user_in);
                    break;
                case 3:
                    System.out.println("Update Employee");
                    Scanner user_in_scan1 = new Scanner(System.in);
                    System.out.print("Please enter the desired employee ID: ");
                    int user_in1 = user_in_scan1.nextInt();
                    employeeServices_link.updateEmployee(user_in1);
                    break;
                case 4:
                    System.out.println("Delete Employee");
                    Scanner user_in_scan2 = new Scanner(System.in);
                    System.out.print("Please enter the desired employee ID: ");
                    int user_in2 = user_in_scan2.nextInt();
                    employeeServices_link.deleteemployee(user_in2);
                    break;
                case 5:
                    System.out.println("View all Employee");
                    employeeServices_link.viewallEmployee();
                    break;
                case 6:
                    System.out.println("Thank you for using our application.");
                    System.exit(0);
                default:
                    System.out.println("Please enter a valid choice!");
                    break;

            }

        }while(ordering);


    }

}