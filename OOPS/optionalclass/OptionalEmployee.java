import java.util.Optional;

class Employee {

    private int id;
    private String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
    }
}

class InvalidEmployeeException extends Exception {

    InvalidEmployeeException(String message) {
        super(message);
    }
}

public class OptionalEmployee {

    public static void main(String[] args) {

        Employee emp = null;
        // Employee emp = new Employee(101, "Rahul");

        try {
            Employee e = Optional.ofNullable(emp)
                    .orElseThrow(() ->
                            new InvalidEmployeeException("Invalid Employee"));

            e.display();

        } catch (InvalidEmployeeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}