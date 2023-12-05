package lesson19;

//Задача 3: Семейный бюджет Задание: Создайте класс Family, в котором есть статическое свойство balance (семейный бюджет, изначально равен 1000).
//    У каждого члена семьи (экземпляр класса Family) есть методы:
//    - income (метод, который принимает в качестве аргумента число и увеличивает на это значение семейный бюджет).
//    - outcome (метод, который принимает в качестве аргумента число и уменьшает на это значение семейный бюджет).
//        В методе income ??? ([Yuriy]: outcome) должна быть проверка, и средства списываются только в том случае, если на балансе есть достаточная сумма.

public class Family {
    private static int balance = 1000;

    public static int getBalance() {
        return balance;
    }

    public void income(int value) {
        Family.balance += value;
    }

    public void outcome(int value) {
        if (value <= Family.balance) {
            Family.balance -= value;
        } else {
            throw new IllegalArgumentException("Insufficient funds. Go to work!");
        }
    }
}
