package lesson21;

//6. Книги Создать класс Book, представляющий книгу. Класс должен иметь следующие поля:
//        title (название книги)
//        author (автор книги)
//        price (цена)
//
//        Необходимо реализовать перегруженные конструкторы для класса Book:
//        -Конструктор с одним параметром:
//        Принимает только название книги. Остальные свойства author - "Unknown" price - 0.
//        -Конструктор с двумя параметрами:
//        Принимает название книги и автора. Остальные свойства price - 0.
//        -Конструктор с тремя параметрами:
//        Принимает название книги, автора и цена.

public class Book {
    private static final String DEFAULT_AUTHOR = "Unknown";
    private static final double DEFAULT_PRICE = 0;

    private String title;
    private String author;
    private double price;

    public Book(String title) {
        this(title, DEFAULT_AUTHOR);
    }

    public Book(String title, String author) {
        this(title, author, DEFAULT_PRICE);
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s - %s (price: %.2f)", author, title, price);
    }
}
