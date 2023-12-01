package lesson17;

//Класс "Круг" (Circle): Создайте класс "Круг", который содержит радиус. Реализуйте геттеры и сеттеры для радиуса.
// Геттер должен возвращать радиус, а сеттер — устанавливать новое значение радиуса. Обеспечьте, чтобы радиус не мог быть отрицательным.

public class Circle {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("radius must be greater than 0");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
