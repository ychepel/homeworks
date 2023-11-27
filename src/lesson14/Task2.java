package lesson14;

public class Task2 {
//    Напишите статический метод в Java, который вычисляет среднее значение элементов в массиве. Метод долженг вывести результат в терминал.
//    Пример ввода и вывода:
//
//    Аргументы: [5, 8, 2, 10, 3]
//    Выход: Среднее значение: 5.6

    public static void main(String[] args) {
        int[] array = {5, 8, 2, 10, 3};
        printAverage(array);
    }

    private static void printAverage(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        float average = (float) sum / array.length;

        System.out.println("Среднее значение: " + average);
    }
}
