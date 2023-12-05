package lesson19;

//Задача 1: Хранение информации о студентах Задание: Создайте класс Student, у каждого объекта которого будет
// уникальный идентификационный номер (статическое свойство). Используйте статическое свойство для автоматического
// присвоения уникальных номеров студентам.

public class Student {
    private static int counter;
    private int id;

    public Student() {
        this.id = ++Student.counter;
    }

    public int getId() {
        return id;
    }
}
