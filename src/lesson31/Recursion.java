package lesson31;

public class Recursion {
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sum(n - 1);
        }
    }

    public static int multiply(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        } else if (b < 0) {
            return -multiply(a, -b);
        } else {
            return a + multiply(a,b - 1);
        }
    }

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void printNumbers(int n) {
        if (n != 0) {
            printNumbers(n - 1);
            System.out.print(n +  "; ");
        }
    }

    public static void printDescNumbers(int n) {
        if (n != 0) {
            System.out.print(n + "; ");
            printDescNumbers(n - 1);
        }
    }
}
