package lesson16;

//Задача 9: Дата Создайте класс Date, который имеет свойства day, month и year (день, месяц и год), конструктор для их
// инициализации, и метод displayDate, выводящий дату в формате "dd/mm/yyyy".

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void displayDate() {
        System.out.printf("%02d/%02d/%d%n", day, month, year);
    }
}
