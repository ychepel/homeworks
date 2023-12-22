package lesson31;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Task #1: sum(0) = %d%n", Recursion.sum(0));
        System.out.printf("Task #1: sum(2) = %d%n", Recursion.sum(2));
        System.out.printf("Task #1: sum(4) = %d%n", Recursion.sum(4));

        System.out.println();

        System.out.printf("Task #2: multiply(-11, 3) = %d%n", Recursion.multiply(-11, 3));
        System.out.printf("Task #2: multiply(20, -2) = %d%n", Recursion.multiply(20, -2));
        System.out.printf("Task #2: multiply(-8, -2) = %d%n", Recursion.multiply(-8, -2));
        System.out.printf("Task #2: multiply(2, 0) = %d%n", Recursion.multiply(2, 0));
        System.out.printf("Task #2: multiply(0, 3) = %d%n", Recursion.multiply(0, 3));
        System.out.printf("Task #2: multiply(4, 6) = %d%n", Recursion.multiply(4, 6));
        System.out.printf("Task #2: multiply(5, 5) = %d%n", Recursion.multiply(5, 5));

        System.out.println();

        System.out.printf("Task #3: factorial(0) = %d%n", Recursion.factorial(0));
        System.out.printf("Task #3: factorial(1) = %d%n", Recursion.factorial(1));
        System.out.printf("Task #3: factorial(5) = %d%n", Recursion.factorial(5));

        System.out.println();

        System.out.print("Task #4: printNumber(5) - ");
        Recursion.printNumbers(5);

        System.out.println();
        System.out.println();

        System.out.print("Task #5: printDescNumber(7) - ");
        Recursion.printDescNumbers(7);

    }
}
