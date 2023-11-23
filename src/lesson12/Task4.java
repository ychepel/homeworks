package lesson12;

public class Task4 {
//    Сумма максимальных чисел
//
//    Условие: Напишите программу, в которой объявленй двумерный массив из целых чисел.
//    Программа должна вывести сумму всех максимальных чисел вложенных массивов.
//    Исходный массив: {{3, 4, 1}, {6, 3}, {9, 3, 5, 4}}
//    Пример вывода: 19

    public static void main(String[] args) {
        int[][] array = {
            {3, 4, 1},
            {6, 3},
            {9, 3, 5, 4}
        };
        int total = 0;

        for (int i = 0; i < array.length; i++) {
            int arrayMaxValue = array[i][0];
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] > arrayMaxValue) {
                    arrayMaxValue = array[i][j];
                }
            }
            total += arrayMaxValue;
        }

        System.out.println("Sum of maximum values: " + total);
    }
}
