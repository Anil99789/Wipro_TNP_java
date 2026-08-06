import java.io.*;
import java.util.Scanner;

public class EmployeeManagementSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Main Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    addEmployee(sc);
                    break;

                case 2:
                    displayEmployees();
                    break;

                case 3:
                    System.out.println("Application Closed.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);

        sc.close();
    }

    // Method to add employee details
    public static void addEmployee(Scanner sc) {
        try {
            FileWriter fw = new FileWriter("employee.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Designation: ");
            String designation = sc.nextLine();

            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();

            bw.write(id + "," + name + "," + designation + "," + salary);
            bw.newLine();

            bw.close();

            System.out.println("Employee Added Successfully.\n");

        } catch (IOException e) {
            System.out.println("Error while writing file.");
        }
    }

    // Method to display all employees
    public static void displayEmployees() {
        try {
            File file = new File("employee.txt");

            if (!file.exists()) {
                System.out.println("No employee records found.\n");
                return;
            }

            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;

            System.out.println("\n------ Employee Report ------");
            System.out.printf("%-10s %-20s %-20s %-10s\n",
                    "ID", "Name", "Designation", "Salary");

            while ((line = br.readLine()) != null) {
                String data[] = line.split(",");
                System.out.printf("%-10s %-20s %-20s %-10s\n",
                        data[0], data[1], data[2], data[3]);
            }

            System.out.println("------ End of Report ------\n");

            br.close();

        } catch (IOException e) {
            System.out.println("Error while reading file.");
        }
    }
}