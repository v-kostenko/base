package patterns.state;

public interface State {

    void printBallance();
    void withdrawMoney(double sum);

    void topUp(double amount);
}
