package patterns.state;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1, "Bob", 1000, 1000);

        bankAccount.withdraw(1100);
        bankAccount.showBalance();

        bankAccount.topUpAccount(50);
        bankAccount.showBalance();

        bankAccount.topUpAccount(50);
        bankAccount.showBalance();
    }
}
