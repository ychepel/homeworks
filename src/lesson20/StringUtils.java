package lesson20;

//Работа с текстом: Напишите статический метод StringUtils.isPalindrome(), который принимает на вход строку и
// определяет, является ли она палиндромом (читается одинаково вперед и назад). Проверьте метод на нескольких примерах.


//Счетчик символов: Напишите статический метод StringUtils.countOccurrences(), который принимает строку и
// символ, подсчитывает количество вхождений этого символа в строку.

public class StringUtils {
    public static boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static int countOccurrences(String str, Character symbol) {
        int occurences = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symbol) {
                occurences++;
            }
        }
        return occurences;
    }
}
