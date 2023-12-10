package lesson23;

public class HourlyEmployee extends Employee {
    private double salaryPerHour;
    private int hoursInMonth;

    public HourlyEmployee(double salary, double salaryPerHour, int hoursInMonth) {
        super(salary);
        this.salaryPerHour = salaryPerHour;
        this.hoursInMonth = hoursInMonth;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + salaryPerHour * hoursInMonth;
    }
}
