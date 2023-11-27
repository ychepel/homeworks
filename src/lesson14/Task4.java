package lesson14;

public class Task4 {
//    Напишите статический метод в Java, который проверяет, является ли заданное число четным. Метод долженг вывести результат в терминал.
//    Пример ввода и вывода:
//
//    Вход: 7
//    Выход: 7 - нечетное число

    public static void main(String[] args) {
        printType(7);
    }

    private static void printType(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " - четное число");
        } else {
            System.out.println(number + " - нечетное число");
        }
    }
}
