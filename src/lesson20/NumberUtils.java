package lesson20;

//Проверка на четность: Реализуйте статический метод NumberUtils.isEven(), который принимает целое число и возвращает
// true, если число четное, и false в противном случае.

public class NumberUtils {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
