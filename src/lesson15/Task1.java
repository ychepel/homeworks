package lesson15;

public class Task1 {
//    Работа с числами: Напишите статический метод isEven, который принимает целое число и возвращает true, если число четное, и false в противном случае.

    public static void main(String[] args) {
        System.out.println(isEven(6));
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
