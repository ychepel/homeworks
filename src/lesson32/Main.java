package lesson32;

public class Main {
    public static void main(String[] args) {
        Object[] array = {
                new Object[]{3, 6, 4, 76, 4},
                new Object[]{1, new Object[]{4, 3}, 6},
                4,
                new Object[]{new Object[]{12, 43}, 5, 43}
        };

        System.out.println("Recursion sum = " + Recursion.sum(array));

        Employee employee1 = new Employee("Olha", "Petrova", 1200);
        Employee employee2 = new Employee("Anatoly", "Ushanov", 1500);
        Employee employee3 = new Employee("Maria", "Romanova", 1300);

        Employee employee4 = new Employee("Maksim", "Hrybov", 2300, new Employee[]{employee3});

        Employee employee5 = new Employee("Petr", "Ivanov", 5300, new Employee[]{employee1, employee2, employee4});


    }
}
