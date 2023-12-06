package lesson21;

//2. Работа с массивами
//
//        Создайте класс ArrayManipulator с перегруженными методами для нахождения суммы элементов массива разных
//        типов (целочисленного и дробные). Продемонстрируйте использование методов.

public class ArrayManipulator {
    public static int sum(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }

    public static double sum(double[] array) {
        double sum = 0;
        for (double number : array) {
            sum += number;
        }
        return sum;
    }
}
