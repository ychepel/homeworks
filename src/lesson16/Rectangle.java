package lesson16;

//Задача 5: Прямоугольник Создайте класс Rectangle, имеющий свойства length и width (длина и ширина прямоугольника),
// конструктор для их инициализации, и метод calculatePerimeter, возвращающий периметр прямоугольника.

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculatePerimeter() {
        return (length + width) * 2;
    }
}
