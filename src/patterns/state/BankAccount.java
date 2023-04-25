package patterns.state;

public class BankAccount {
    private long id;
    private String owner;
    private double balance;
    private double creditLimit;
    private State currentState;

    public BankAccount(long id, String owner, double balance, double creditLimit) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
        this.creditLimit = creditLimit;
        currentState = new OpenState();
    }

    public void setCurrentState(State state) {
        this.currentState = state;
    }

    public void showBalance() {
        currentState.printBallance();
    }

    public void blockAccount() {
        currentState = new BlockedState();
        System.out.println("Account is blocked!");
    }

    public void unblockAccount() {
        currentState = new OpenState();
        System.out.println("Account is Opened");
    }

    public void withdraw(double amount) {
        currentState.withdrawMoney(amount);
    }

    public void topUpAccount(double sum) {
        currentState.topUp(sum);
    }


    private class OpenState implements State {
        @Override
        public void printBallance() {
            System.out.println("Balance: " + balance + " y.e.");
        }

        @Override
        public void withdrawMoney(double sum) {
            if (sum < balance + creditLimit) {
                balance -= sum;
                System.out.println(sum + " was withdraw from your account. \nBalance: " + balance + " y.e.");
                if (balance < 0) {
                    currentState = new CreditLimit();
                }
            } else {
                System.out.println("Not enough money on your account");
            }
        }

        @Override
        public void topUp(double sum) {
            balance += sum;
            System.out.println("Account was top up on " + sum + ". Balance is: " + balance);
        }

    }

    private class CreditLimit implements State {
        @Override
        public void printBallance() {
            System.out.println("Balance: " + balance + " y.e.");
        }

        @Override
        public void withdrawMoney(double sum) {
            if ((creditLimit - Math.abs(balance) >= sum)) {
                balance = balance - sum;
                System.out.println(sum + " was withdraw from your account. \nBalance: " + balance + " y.e.");
            } else {
                System.out.println("Not enough money on your account");
            }
        }

        @Override
        public void topUp(double sum) {
            if (balance + sum >= 0) {
                System.out.println("Account was top up on " + sum + ". Balance is: " + balance);
                balance =+ sum;
                currentState = new OpenState();
            } else {
                System.out.println("Account was top up on " + sum + ". Balance is: " + balance);
            }
        }
    }

    private class BlockedState implements State {
        @Override
        public void printBallance() {
            System.out.println("From BlockState class Account is blocked!");
        }

        @Override
        public void withdrawMoney(double sum) {
            System.out.println("Account is blocked");
        }

        @Override
        public void topUp(double sum){
            System.out.println("Account is blocked. You are not able to top up");
        }
    }


}
