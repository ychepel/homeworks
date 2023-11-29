package lesson15;

public class Task4 {
//    Преобразование единиц измерения:
//
//    Напишите статический метод convertCelsiusToFahrenheit, который принимает температуру в градусах Цельсия и
//    возвращает ее эквивалент в градусах Фаренгейта.

    public static void main(String[] args) {
        System.out.printf("15 Celsius to Fahrenheit is %.2f", convertCelsiusToFahrenheit(15));
    }

    private static double convertCelsiusToFahrenheit(int celsius) {
        return (double) celsius * 1.8 + 32;
    }
}
