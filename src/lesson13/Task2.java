package lesson13;

import java.util.Scanner;

public class Task2 {
//    Напишите программу, которая проверяет, содержится ли заданное число в двумерном массиве используя forEach.
//    Пример ввода: Пример массива: { {1, 4, 2, 6, 3}, {6, 3, 5, 2}, {12, 4, 23, 6, 4}, } Искомое число: 3
//    Пример вывода: Число 3 содержится в массиве.

    public static void main(String[] args) {
        int[][] array = { {1, 4, 2, 6, 3}, {6, 3, 5, 2}, {12, 4, 23, 6, 4} };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Искомое число: ");
        int inputedValue = scanner.nextInt();
        boolean isInArray = false;

        for (int[] innerArray : array) {
            for (int number : innerArray) {
                if (number == inputedValue) {
                    isInArray = true;
                    break;
                }
            }
            if (isInArray) {
                break;
            }
        }

        if (isInArray) {
            System.out.printf("Число %d содержится в массиве.", inputedValue);
        } else {
            System.out.printf("Число %d не содержится в массиве.", inputedValue);
        }

    }
}
