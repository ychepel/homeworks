package lesson16;

//Задача 4: Книга Создайте класс Book, содержащий свойства title (название книги) и author (автор книги), конструктор
// для их инициализации, и метод displayInfo, выводящий информацию о книге.

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.printf("%s - %s%n", title, author);
    }
}
