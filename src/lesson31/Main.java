package lesson31;

public class Main {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();

        System.out.printf("Task #1: sum(0) = %d%n", recursion.sum(0));
        System.out.printf("Task #1: sum(2) = %d%n", recursion.sum(2));
        System.out.printf("Task #1: sum(4) = %d%n", recursion.sum(4));

        System.out.println();

        System.out.printf("Task #2: multiply(-11, 3) = %d%n", recursion.multiply(-11, 3));
        System.out.printf("Task #2: multiply(20, -2) = %d%n", recursion.multiply(20, -2));
        System.out.printf("Task #2: multiply(-8, -2) = %d%n", recursion.multiply(-8, -2));
        System.out.printf("Task #2: multiply(2, 0) = %d%n", recursion.multiply(2, 0));
        System.out.printf("Task #2: multiply(0, 3) = %d%n", recursion.multiply(0, 3));
        System.out.printf("Task #2: multiply(4, 6) = %d%n", recursion.multiply(4, 6));
        System.out.printf("Task #2: multiply(5, 5) = %d%n", recursion.multiply(5, 5));

        System.out.println();

        System.out.printf("Task #3: factorial(1) = %d%n", recursion.factorial(1));
        System.out.printf("Task #3: factorial(5) = %d%n", recursion.factorial(5));

        System.out.println();

        System.out.print("Task #4: printNumber(5) - ");
        recursion.printNumbers(5);

        System.out.println();
        System.out.println();

        System.out.print("Task #5: printDescNumber(7) - ");
        recursion.printDescNumbers(7);

    }
}
