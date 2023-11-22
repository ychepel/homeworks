package lesson11;

import java.util.Scanner;

public class Task1 {
//    Поиск среднего значения в массиве:
//
//    Условие: Найти среднее значение элементов массива.
//    Исходный массив: [5, 10, 15, 20]
//    Пример вывода: Среднее значение: 12.5

    public static void main(String[] args) {
        int[] array = {5, 10, 15, 20};

        int totalSum = 0;
        for (int i = 0; i < array.length; i++) {
            totalSum += array[i];
        }

        System.out.printf("Average value is %.2f", (double) totalSum / array.length);
    }
}
