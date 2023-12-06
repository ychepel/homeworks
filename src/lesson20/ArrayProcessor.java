package lesson20;

//Обработка числовых массивов: Создайте класс ArrayProcessor который в качестве статического свойства хранит массив из
// чисел. Напишите статические методы, которые находят среднее значение, максимальное, минимальное, суммарное в
// массиве, который хранится в статическом свойстве.

public class ArrayProcessor {
    private static int[] numbers;

    public static void setNumbers(int[] numbers) {
        ArrayProcessor.numbers = numbers;
    }

    private static void failIfEmpty() {
        if (numbers.length == 0) {
            throw new UnsupportedOperationException("array is empty");
        }
    }

    public static double average() {
        failIfEmpty();
        return (double) sum() / numbers.length;
    }

    public static int max() {
        failIfEmpty();
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int min() {
        failIfEmpty();
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int sum() {
        failIfEmpty();
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
