public class EmployeeClone {

    public static void main(String[] args) {

        try {

            // Original Employee
            Employee emp1 = new Employee(101, "Gopi", "IT", 50000);

            // Clone Employee
            Employee emp2 = (Employee) emp1.clone();

            // Modify Original Employee
            emp1.setName("Raju");
            emp1.setDepartment("HR");
            emp1.setSalary(65000);

            System.out.println("Original Employee");
            System.out.println("-----------------");
            emp1.display();

            System.out.println();

            System.out.println("Cloned Employee");
            System.out.println("----------------");
            emp2.display();

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
    }
}