package lesson17;

//Класс "Банковский счет" (BankAccount): Разработайте класс "Банковский счет" с атрибутами для номера счета, баланса
// и владельца счета. Реализуйте геттеры и сеттеры для этих атрибутов. Баланс не может быть отрицательным.

public class BankAccount {
    private String number;
    private int balance;
    private String owner;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("balance cannot be less than 0");
        }
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
