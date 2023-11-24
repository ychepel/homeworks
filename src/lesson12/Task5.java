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
        int maxLengthArray = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].length >= array[maxLengthArray].length) {
                maxLengthArray = i;
            }
        }

        int[] longestSubArray = array[maxLengthArray];
        int maxValue = longestSubArray[0];

        for (int i = 0; i < longestSubArray.length; i++) {
            if (maxValue < longestSubArray[i]) {
                maxValue = longestSubArray[i];
            }
        }

        System.out.println("Max value in biggest sub array: " + maxValue);
    }
}
