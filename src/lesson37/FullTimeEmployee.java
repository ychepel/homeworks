package lesson37;

public class FullTimeEmployee extends Employee {
    private static final int TAX_PERCENTAGE = 10;
    private double salary;

    public FullTimeEmployee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return this.salary * (100 - TAX_PERCENTAGE) / 100;
    }
}
