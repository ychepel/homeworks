package lesson11;

import java.util.Scanner;

public class Task2 {
//    Поиск максимального элемента и его индекса в массиве:
//
//    Условие: Найти максимальный элемент в массиве и вывести его значение и индекс.
//    Исходный массив: [3, 7, 1, 9, 5]
//    Пример вывода: Максимальный элемент

    public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 5};

        int maxIndex = 0;
        int maxValue = array[maxIndex];

        for (int i = maxIndex + 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }

        System.out.printf("Maximum value is %d in array element %d", maxValue, maxIndex);
    }
}
