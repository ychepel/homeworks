package lesson16;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(18, 3);
        System.out.println(calculator.divide());
        System.out.println("--------");

        Student student = new Student("John", 3);
        student.displayDetails();
        System.out.println("--------");

        Circle circle = new Circle(5.6);
        System.out.println(circle.calculateArea());
        System.out.println("--------");

        Book book = new Book("Effective Java", "Joshua Bloch");
        book.displayInfo();
        System.out.println("--------");

        Rectangle rectangle = new Rectangle(3.5, 6);
        System.out.println(rectangle.calculatePerimeter());
        System.out.println("--------");

        User user = new User("JSmith", "super-secure");
        System.out.println(user.validatePassword("JSmith", "super-secure"));
        System.out.println("--------");

        Counter counter = new Counter(3);
        counter.increment().increment().increment().decrement();
        System.out.println(counter.getCount());
        System.out.println("--------");

        Store store = new Store("Google Pixel 10", 999.99);
        store.displayProductInfo();
        System.out.println("--------");

        Date date = new Date(3, 9, 2020);
        date.displayDate();
        System.out.println("--------");

    }
}
