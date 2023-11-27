package lesson14;

public class Task5 {
//    Напишите статический метод в Java, который подсчитывает количество цифр в заданном числе. Метод долженг вывести результат в терминал.
//    Пример ввода и вывода:
//
//    Аргументы: 12345
//    Выход: Количество цифр: 5

    public static void main(String[] args) {
        printLength(12345);
    }

    private static void printLength(int number) {
        int length = 0;
        int numberCounter = number;
        while (numberCounter > 0) {
            numberCounter /= 10;
            length++;
        }

        System.out.println("Количество цифр: " + length);
    }
}
