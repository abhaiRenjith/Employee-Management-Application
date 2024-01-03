import java.util.*;
import java.lang.*;


public class EmployeeService {

    boolean found = false;
    HashSet<Employee> empset = new HashSet<Employee>();

    Employee emp1 = new Employee(101, "Shital", 24, "IT", "Developer", 25000);
    Employee emp2 = new Employee(102, "Mann", 56, "IT", "CEO", 95000);
    Employee emp3 = new Employee(103, "Woman", 76, "IT", "Admin", 85000);
    Employee emp4 = new Employee(104, "Boy", 21, "IT", "Developer", 15000);

    int id;
    String name;
    int age;
    String department;
    String designation;
    double salary;

    public EmployeeService() {
        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
        empset.add(emp4);


    }

    //View all employee
    public void viewallEmployee() {
        for (Employee i : empset) {
            System.out.println(i);
        }
    }

    //View employees based on their ID
    public void viewEmployee(int IDnum) {
        for (Employee i : empset) {
            if (i.getId() == IDnum) {
                System.out.println(i);
                found = true;
            }

        }
        if (!found) {
            System.out.print("Employee ID not in database.");
        }
    }

    //update employee
    public void updateEmployee(int ID) {
        for (Employee i : empset) {
            if (i.getId() == ID) {
                Scanner user_dec_scan = new Scanner(System.in);
                System.out.println(i);
                System.out.print("Are you sure you want to modify the employee displayed above(Y/N): ");
                String user_dec = user_dec_scan.nextLine();
                found = true;
                if (Objects.equals(user_dec, "y") || Objects.equals(user_dec, "Y")) {
                    Scanner user_selection_scan = new Scanner(System.in);
                    System.out.println(" Select the data that you would like to update: \n1. Name \n2. Department \n3. Salary \n4. Abort");
                    int user_selection = user_selection_scan.nextInt();
                    switch (user_selection) {
                        case 1:
                            System.out.print("Enter the desired name: ");
                            Scanner desired_name_scan = new Scanner(System.in);
                            String desired_name = desired_name_scan.nextLine();
                            i.setName(desired_name);
                            System.out.print(i);
                        case 2:
                            System.out.print("Enter the desired department name: ");
                            Scanner desired_department_scan = new Scanner(System.in);
                            String desired_department_name = desired_department_scan.nextLine();
                            i.setDepartment(desired_department_name);
                            System.out.print(i);
                        case 3:
                            Scanner desired_salary_scan = new Scanner(System.in);
                            System.out.print("Enter the desired salary: ");
                            int desired_salary = desired_salary_scan.nextInt();
                            i.setSalary(desired_salary);
                            System.out.print(i);
                        case 4:
                            System.out.print("Thank you for using our application.");
                            System.exit(0);
                    }
                }
            }
        }
        if (!found) {
            System.out.println("Employee not in database. Try adding the employee to database.");
        }
    }
    public void deleteemployee(int ID){
        for(Employee i:empset){
            if(i.getId() == ID){
                empset.remove(i);
            }
        }
    }
    public void addemployee(){
        Scanner newemp_ID_scan = new Scanner(System.in);
        System.out.print("Enter new employee ID:");
        int newemp_ID = newemp_ID_scan.nextInt();
        System.out.print("Enter new employee name:");
        String newemp_name = newemp_ID_scan.nextLine();
        System.out.print("Enter new employee age:");
        int newemp_age = newemp_ID_scan.nextInt();
        System.out.print("Enter new employee department:");
        String newemp_department = newemp_ID_scan.nextLine();
        System.out.print("Enter new employee designation:");
        String newemp_designation = newemp_ID_scan.nextLine();
        System.out.print("Enter new employee salary:");
        int newemp_salary = newemp_ID_scan.nextInt();
        Employee x = new Employee(newemp_ID , newemp_name, newemp_age, newemp_department, newemp_designation, newemp_salary);
        empset.add(x);
    }
}





