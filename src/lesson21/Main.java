package lesson21;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1 demo:");
        System.out.println(StringUtils.concat("Hello ", "world!"));
        System.out.println(StringUtils.concat("Today is December 6th, ", 2023));

        System.out.println("\nTask 2 demo:");
        int[] intArray = {2, 5, 7, -5, 0, 10};
        double[] doubleArray = {2.56, 3.3333, -4.2, -5, 5.45};
        System.out.println(ArrayManipulator.sum(intArray));
        System.out.println(ArrayManipulator.sum(doubleArray));

        System.out.println("\nTask 3 demo:");
        System.out.printf("%d ^ %d = %.0f%n", 4, 3, Calculator.power(4, 3));
        System.out.printf("%d ^ 2 = %.0f%n", 6, Calculator.power(6));

        System.out.println("\nTask 4 demo:");
        int[] array = {2, 5, 7, 1};
        System.out.println(Calculator.sum(3, 40));
        System.out.println(Calculator.sum(array));

        System.out.println("\nTask 5 demo:");
        int[] array1 = {1, 2, 3};
        int[] array2 = {6, 5, 4};
        System.out.println(Calculator.sum(array1, array2));

        System.out.println("\nTask 6 demo:");
        System.out.println(new Book("Book1 Title"));
        System.out.println(new Book("Book2 Title", "Book2 Author"));
        System.out.println(new Book("Book3 Title", "Book3 Author", 299.99));
    }
}
