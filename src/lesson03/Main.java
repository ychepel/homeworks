package lesson03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input boolean value [true/false]: ");
        boolean booleanValue = scanner.nextBoolean();

        System.out.print("Please input integer value: ");
        int intValue = scanner.nextInt();

        System.out.print("Please input short value: ");
        int shortValue = scanner.nextShort();

        System.out.print("Please input float value: ");
        float floatValue = scanner.nextFloat();

        System.out.print("Please input double value: ");
        double doubleValue = scanner.nextDouble();


        System.out.println("\n----------\nYour entered values:");
        System.out.println(booleanValue);
        System.out.println(intValue);
        System.out.println(shortValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
    }
}
