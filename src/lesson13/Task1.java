package lesson13;

public class Task1 {
//    Напишите программу, которая находит максимальный элемент в массиве используя цикл forEach.
//    Пример ввода: Массив: [5, 8, 2, 10, 3] Пример вывода: Максимальный элемент: 10

    public static void main(String[] args) {
        int[] array = {5, 8, 2, 10, 3};
        int max = array[0];
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Максимальный элемент: " + max);
    }
}
