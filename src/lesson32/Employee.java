package lesson32;

public class Employee {
    public String firstName;
    public String lastName;
    public double salary;
    public Employee[] subordinates;

    public Employee(String firstName, String lastName, double salary, Employee[] subordinates) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.subordinates = subordinates;
    }

    public Employee(String firstName, String lastName, double salary) {
        this(firstName, lastName, salary, new Employee[0]);
    }
}
