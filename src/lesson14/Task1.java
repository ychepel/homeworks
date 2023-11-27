package lesson14;

public class Task1 {
//    Напишите статический метод в Java, который находит сумму всех целых чисел в заданном диапазоне. Метод долженг вывести результат в терминал.
//    Пример ввода и вывода:
//
//    Аргументы: 1, 5
//    Выход: Сумма чисел от 1 до 5: 15

    public static void main(String[] args) {
        printRangeSum(1, 5);
    }

    private static void printRangeSum(int min, int max) {
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }

        System.out.printf("Сумма чисел от %d до %d: %d", min, max, sum);
    }
}
