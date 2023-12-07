package lesson22;

//1.Создайте базовый класс "Транспортное Средство" с методами start() и stop(). Создайте подклассы "Автомобиль" и
// "Велосипед" и проверьте работу методов start() и stop().

//2.Создайте базовый класс "Сотрудник" с полями имя и зарплата. Создайте подклассы "Менеджер" и "Работник",
// унаследованные от "Сотрудник". Добавьте дополнительное поле "уровень" (число от 1 до 10) для менеджера.
// Добавьте getter и setter для свойства "уровень".

//3.Создайте базовый класс "Товар" с полями название и цена. Создайте подклассы "Книга". Класс "Книга" должен содержать
// дополнительное поле "Автор".

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
        Bicycle bicycle = new Bicycle();
        bicycle.start();
        bicycle.stop();

        System.out.println("-------------");
        Manager manager = new Manager("Barak", 3500, 5);
        System.out.printf("%s is %d level manager%n",  manager.getName(), manager.getLevel());
        Worker worker = new Worker("Obama", 1500);
        System.out.printf("%s is worker and has no level%n", worker.getName());

        System.out.println("-------------");
        Book book = new Book("Book name", 30, "Book author");
        System.out.printf("%s - %s%n", book.getAuthor(), book.getName());
    }
}
