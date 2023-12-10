package lesson23;

//Создайте класс Employee со свойством salary и методом calculateSalary(). Данный метод должен просто возвращать salary.
//Реализуйте дочерний класс HourlyEmployee, который содержит помимо свойства salary свойство salaryPerHour
// (зарплата за час) и свойство hoursInMonth (кол-во отработанных часов за месяц).
//Переопределите метод calculateSalary(), который возвращает сумму ставки сотрудника и стоимости отработанных им часов.

public class Employee {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateSalary() {
        return salary;
    }
}
