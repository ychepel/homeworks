package lesson11;

public class Task5 {
//    Сумма четных чисел массива:
//
//    Условие: Напишите программу, которая находит сумму четных чисел.
//    Исходный массив: [3, 7, 2, 1, 9, 4, 5]
//    Пример вывода: Результат: 6

    public static void main(String[] args) {
        int[] array = {3, 7, 2, 1, 9, 4, 5};
        int sumOfEvenNumbers = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sumOfEvenNumbers += array[i];
            }
        }

        System.out.println("Результат: " + sumOfEvenNumbers);
    }
}
