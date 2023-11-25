package lesson13;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
//    Напишите программу, которая находит заданный элемент в массиве и заменяет его на новое значение используя цикл while.
//    Пример ввода: Массив: [2, 5, 8, 10, 5] Искомый элемент: 8 Новое значение: 12
//    Пример вывода: Массив после замены: [2, 5, 12, 10, 5]

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 5};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Искомый элемент: ");
        int oldValue = scanner.nextInt();
        System.out.print("Новое значение: ");
        int newValue = scanner.nextInt();

        int index = 0;
        while (index < array.length) {
            if (array[index] == oldValue) {
                array[index] = newValue;
            }
            index++;
        }

        System.out.println("Массив после замены: " + Arrays.toString(array));
    }
}
