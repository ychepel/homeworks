package lesson20;

//Калькулятор площади: Создайте класс AreaCalculator с статическими методами для вычисления площади различных фигур,
// таких как круг, прямоугольник и треугольник. Пользователь должен иметь возможность выбрать фигуру и ввести
// необходимые параметры (например, радиус, длину и ширину).

public class AreaCalculator {
    public static double circle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double rectangle(double width, double length) {
        return width * length;
    }

    public static double triangle(double base, double height) {
        return base * height / 2;
    }
}
