package lesson20;

public class Main {
    public static void main(String[] args) {
        System.out.println(StringUtils.isPalindrome("mama"));
        System.out.println(StringUtils.isPalindrome("level"));
        System.out.println(StringUtils.isPalindrome("a"));
        System.out.println(StringUtils.isPalindrome("Madam"));

        System.out.println("------------");
        System.out.println(StringUtils.countOccurrences("hello world", 'l'));

        System.out.println("------------");
        int[] array = {3, 5, 7, 10, 5};
        ArrayProcessor.setNumbers(array);
        System.out.println(ArrayProcessor.max());
        System.out.println(ArrayProcessor.min());
        System.out.println(ArrayProcessor.sum());
        System.out.println(ArrayProcessor.average());
    }
}
