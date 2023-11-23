package lesson12;

import java.util.Scanner;

public class Task1 {
//    Вывод периметра квадрата:
//
//    Условие: Напишите программу, которая получает число и отрисовывает квадрат из звездочек с соответствующей стороной.
//    Квадрат должен быть без внутреннего наполнения (только стенки).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter square size: ");
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                String cell = "  ";
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    cell = "* ";
                }
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}
