package lesson12;

import java.util.Scanner;

public class Task2 {
//    Вывод периметра треугольника
//
//    Условие: Напишите программу, которая получает число и отрисовывает равносторонний прямоугольный треугольник из звездочек
//    с соответствующими длинами катетов. Треугольник должен быть без внутреннего наполнения (только стенки).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter triangle size: ");
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                String cell = "  ";
                if (i == 0 || i == size - 1 || j == 0 || j == i) {
                    cell = "* ";
                }
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}
