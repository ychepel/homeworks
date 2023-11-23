package lesson12;

public class Task5 {
//    Максимальное число самого длинного массива:
//
//    Условие: Напишите программу, в которой объявленй двумерный массив из целых чисел.
//    Программа должна вывести максимальное число из самого длинного вложенного массива.
//    Исходный массив: {{3, 4, 1}, {6, 3}, {9, 3, 5, 4}}
//    Пример вывода: 9

    public static void main(String[] args) {
        int[][] array = {
                {3, 4, 1},
                {6, 3},
                {9, 3, 5, 4}
        };
        int maxSubArrayLength = array[0].length;
        int maxValue = array[0][0];

        for (int i = 0; i < array.length; i++) {
            if (array[i].length >= maxSubArrayLength) {
                maxSubArrayLength = array[i].length;
                maxValue = array[i][0];
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] > maxValue) {
                        maxValue = array[i][j];
                    }
                }
            }
        }

        System.out.println("Max value in biggest sub array: " + maxValue);
    }
}
