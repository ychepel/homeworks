package lesson15;

public class Task2 {
//    Операции с массивами:
//
//    Реализуйте статический метод findMax, который принимает массив целых чисел и возвращает максимальное значение.

    public static void main(String[] args) {
        int[] array = {-2, 3, 0, 5, 18};
        System.out.println(findMax(array));
    }

    private static int findMax(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("array should not be empty");
        }
        int max = array[0];
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}
