package lesson33;

public class Account {
    private String number;
    private double balance;
    private double[] depositAmounts;

    public Account(String number, double balance) {
        this.number = number;
        this.balance = balance;
        clearHist();
    }

    public void replenish(double amount) {
        this.balance += amount;
        storeDepositAmount(amount);
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("amount exceeded");
            return;
        }
        this.balance -= amount;
    }

    public void clearHist() {
        this.depositAmounts = new double[0];
    }

    public double getMaxDeposit() {
        return getExtremeDepositValue(true);
    }

    public double getMinDeposit() {
        return getExtremeDepositValue(false);
    }

    private double getExtremeDepositValue(boolean isMax) {
        if (this.depositAmounts.length == 0) {
            return -1;
        }
        double result = this.depositAmounts[0];
        for (double deposit : this.depositAmounts) {
            result = (deposit > result == isMax) ? deposit : result;
        }
        return result;
    }

    private void storeDepositAmount(double amount) {
        double[] newDeposits = new double[this.depositAmounts.length + 1];
        for (int i = 0; i < this.depositAmounts.length; i++) {
            newDeposits[i] = this.depositAmounts[i];
        }
        newDeposits[this.depositAmounts.length] = amount;
        this.depositAmounts = newDeposits;
    }
}
