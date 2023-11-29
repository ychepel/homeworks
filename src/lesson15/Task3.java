package lesson15;

public class Task3 {
//    Геометрические вычисления:
//
//    Напишите статический метод calculateCircleArea, который принимает радиус круга и возвращает его площадь.

    public static void main(String[] args) {
        System.out.printf("Circle square: %.2f", calculateCircleArea(23));
    }

    private static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
