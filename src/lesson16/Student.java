package lesson16;

//Задача 2: Студент Создайте класс Student, который содержит свойства name (имя студента) и grade (оценка студента),
// конструктор для их инициализации, и метод displayDetails, выводящий информацию о студенте.

public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public void displayDetails() {
        System.out.printf("Student %s has grade %d%n", name, grade);
    }
}
