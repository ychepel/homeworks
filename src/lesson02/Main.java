package lesson02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input your Name, Last name, Age and City:");

        String name = scanner.next();
        String lastName = scanner.next();
        int age = scanner.nextInt();
        String city = scanner.next();

        System.out.println("\n---Entered data---");
        System.out.println("Name: " + name);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
}
