package lesson15;

public class Task5 {
//    Работа с математическими операциями:
//
//    Реализуйте статический метод calculatePower, который принимает число и его степень, а затем возвращает
//    результат возведения числа в указанную степень

    public static void main(String[] args) {
        System.out.println("Value of 4 to the power of 3 is " + calculatePower(4, 3));
    }

    public static int calculatePower(int number, int power) {
        int result = number;
        for (int i = 2; i <= power; i++) {
            result *= number;
        }
        return result;
    }
}
