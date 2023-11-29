package lesson16;

//Задача 1: Калькулятор Создайте класс Calculator, который имеет свойства operand1 и operand2 (числа для выполнения операций),
// конструктор для их инициализации, и методы add, subtract, multiply и divide, выполняющие соответствующие математические
// операции и возвращающие результат.

public class Calculator {
    private double operand1;
    private double operand2;

    public Calculator(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public double add() {
        return operand1 + operand2;
    }

    public double subtract() {
        return operand1 - operand2;
    }

    public double multiply() {
        return operand1 * operand2;
    }

    public double divide() {
        return operand1 / operand2;
    }
}
