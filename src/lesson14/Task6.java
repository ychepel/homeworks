package lesson14;

public class Task6 {
//    Напишите статический метод в Java, который подсчитывает сумму цифр в числе. Метод долженг вывести результат в терминал.
//    Пример ввода и вывода:
//
//    Аргументы: 12345
//    Выход: Сумма цифр: 15

    public static void main(String[] args) {
        printDigitSum(12345);
    }

    private static void printDigitSum(int number) {
        int sum = 0;
        int numberCounter = number;
        while (numberCounter > 0) {
            sum += numberCounter % 10;
            numberCounter /= 10;
        }

        System.out.println("Сумма цифр: " + sum);
    }
}
