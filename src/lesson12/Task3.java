package lesson12;

import java.util.Scanner;

public class Task3 {
//    Таблица умножения
//
//    Условие: Напишите программу, которая получает от пользователя число и выводит таблицу умножения от 1 до этого числа.
//    Пример ввода: 3
//    Пример вывода: 1 x 1 = 1 1 x 2 = 2 1 x 3 = 3 xxxxxxxxx 2 x 1 = 2 2 x 2 = 4 2 x 3 = 6 xxxxxxxxx 3 x 1 = 3 3 x 2 = 6 3 x 3 = 9}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.printf("%d x %d = %d   ", i, j, i * j);
            }
            System.out.println();
        }
    }
}
