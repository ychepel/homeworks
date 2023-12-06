package lesson21;

//3. Математические операции
//        Создайте класс Calculator с перегруженным методом power. Данный метод должен иметь возможность:
//        вызвать и передать в него два числа (число, возводимое в степень и сама степень)
//        вызвать и передать в него одно число (число в таком случае необходимо возвести в квадрат)
//        power должен возвращать результат

//4. Математические операции
//        Добавть к класса Calculator перегруженный метод sum. Данный метод должен иметь возможность:
//        вызвать и передать в него два числа (метод должен вернуть сумму)
//        вызвать и передать в него массив с числами (метод должен вернуть сумму числе массива)

//5. Математические операции
//        Добавть к методу Calculator еще один метод sum. Он должен принимать два массива в качестве аргументов
//        и возвращать сумму чисел из обоих массивов.

public class Calculator {
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double power(double base) {
        return power(base, 2);
    }

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    public static int sum(int[] array) {
        return ArrayManipulator.sum(array);
    }

    public static int sum(int[] array1, int[] array2) {
        return sum(array1) + sum(array2);
    }
}
