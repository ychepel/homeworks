package lesson13;

import java.util.Scanner;

public class Task5 {
//    Напишите программу, которая получает через терминал натуральные числа и находит сумму четных и нечетных чисел отдельно.
//    При вводе -1 процесс останавливается и программа выводит максимальное число.
//    Пример ввода: Пример ввода: 2, 5, 8, 10, 5
//
//    Пример вывода: Сумма четных: 20 Сумма нечетных: 10

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oddTotal = 0;
        int evenTotal = 0;
        int inputedValue;

        System.out.println("Вводите натуральные значения (либо -1 для остановки):");
        inputedValue = scanner.nextInt();
        while (inputedValue != -1) {
            if (inputedValue % 2 == 0) {
                oddTotal += inputedValue;
            } else {
                evenTotal += inputedValue;
            }
            inputedValue = scanner.nextInt();
        }

        System.out.printf("Сумма четных: %d Сумма нечетных: %d", oddTotal, evenTotal);
    }
}
