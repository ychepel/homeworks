package lesson33;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("1234 8765", 800);
        account.withdraw(900);
        account.replenish(100);
        account.withdraw(900);

        account.replenish(150.3);
        account.replenish(300);
        account.replenish(188);
        account.replenish(0.9);

        System.out.println(account.getMinDeposit());
        System.out.println(account.getMaxDeposit());

        account.clearHist();

        System.out.println(account.getMinDeposit());
        System.out.println(account.getMaxDeposit());
    }
}
