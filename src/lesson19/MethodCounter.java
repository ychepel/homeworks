package lesson19;

//Задача 2: Счетчик вызовов метода Задание: Создайте класс MethodCounter, в котором есть статический счетчик вызовов
// определенного метода. Увеличивайте счетчик при каждом вызове метода.

public class MethodCounter {
    private static int methodCalls;

    public static int getMethodCalls() {
        return MethodCounter.methodCalls;
    }

    public void doSomething() {
        MethodCounter.methodCalls++;
        System.out.println("doing extremely important job...");
    }
}
