package lesson13;

import java.util.Scanner;

public class Task4 {
//    Напишите программу, которая получает через терминал натуральные числа и находит максимальное из введенных.
//    При вводе -1 процесс останавливается и программа выводит максимальное число.
//    Пример ввода: Пример ввода: 2, 5, 8, 10, 5
//
//    Пример вывода: Максимальное число: 10

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int inputedValue;

        System.out.println("Вводите натуральные значения (либо -1 для остановки):");
        do {
            inputedValue = scanner.nextInt();
            if (inputedValue > max) {
                max = inputedValue;
            }
        } while (inputedValue != -1);

        System.out.println("Максимальное число: " + max);
    }
}
