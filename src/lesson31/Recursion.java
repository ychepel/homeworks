package lesson31;

public class Recursion {
    public int sum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sum(n - 1);
        }
    }

    public int multiply(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        } else if (b < 0) {
            return -multiply(a, -b);
        } else {
            return a + multiply(a,b - 1);
        }
    }

    public int factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        printNumbers(n - 1);
        System.out.print(n +  "; ");
    }

    public void printDescNumbers(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + "; ");
        printDescNumbers(n - 1);
    }
}
