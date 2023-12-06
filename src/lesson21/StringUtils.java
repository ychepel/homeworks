package lesson21;

//1. Обработка строк

//        Напишите класс StringUtils с перегруженными методами для конкатенации строк. Один метод должен
//        конкатенировать строки, а другой - строки и числа. Продемонстрируйте использование

public class StringUtils {
    public static String concat(String str1, String str2) {
        return str1 + str2;
    }

    public static String concat(String str, int number) {
        return str + number;
    }
}
