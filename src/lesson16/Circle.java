package lesson16;

//Задача 3: Круг Создайте класс Circle, имеющий свойство radius, конструктор для его инициализации, и метод calculateArea,
// возвращающий площадь круга.

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
