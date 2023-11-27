package lesson14;

public class Task3 {
//    Задача: Напишите статический метод в Java, который находит индекс заданного элемента в массиве. Метод долженг вывести результат в терминал.
//    Пример ввода и вывода:
//
//    Аргументы: [5, 8, 2, 10, 3], 10
//    Выход: Индекс элемента 10: 3

    public static void main(String[] args) {
        int[] array = {5, 8, 2, 10, 3};
        printElementIndex(array, 10);
    }

    private static void printElementIndex(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                System.out.printf("Индекс элемента %d: %d", element, i);
                return;
            }
        }
    }
}
