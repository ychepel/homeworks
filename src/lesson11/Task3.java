package lesson11;

import java.util.Arrays;

public class Task3 {
//    Преобразование всех отрицательных числе массива в положительные:
//
//    Условие: Напишите программу, которая проходится циклом по массиву и преобразует все отрицательные числа в положительные
//    Исходный массив: [3, -7, 1, -9, 5]
//    Пример вывода: [3, 7, 1, 9, 5]

    public static void main(String[] args) {
        int[] array = {3, -7, 1, -9, 5};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] *= -1;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
