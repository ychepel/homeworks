package lesson11;

import java.util.Arrays;

public class Task4 {
//    Поиск предмаксимального элемента и его индекса в массиве:
//
//    Условие: Найти предмаксимальный элемент в массиве и вывести его значение и индекс.
//    Исходный массив: [3, 7, 1, 9, 5]
//    Пример вывода: Максимальный элемент: 7, Индекс: 1

    public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 5};

        int beforeMaxIndex = 0;
        int beforeMaxValue = array[beforeMaxIndex];
        int maxIndex = 0;
        int maxValue = array[maxIndex];

        for (int i = beforeMaxIndex + 1; i < array.length; i++) {
            if (array[i] >= maxValue) {
                beforeMaxIndex = maxIndex;
                beforeMaxValue = array[maxIndex];
                maxIndex = i;
                maxValue = array[i];
            }
        }

        System.out.printf("предМаксимальный элемент: %d, Индекс: %d", beforeMaxValue, beforeMaxIndex);
    }
}
