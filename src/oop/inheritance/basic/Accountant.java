package oop.inheritance.basic;

public class Accountant extends Position{
    private long debitCreditIsNotOk;

    public Accountant(double salary, double experience, Gender gender, long debitCreditIsNotOk){
        super("Accountant", salary, experience, gender);
        this.debitCreditIsNotOk = debitCreditIsNotOk;
    }

    public void countMoney(){
        System.out.println("Count Money");
    }

    public long getDebitCreditIsNotOk() {
        return debitCreditIsNotOk;
    }

    @Override
    public void descriptionWorkFlow() {
        countMoney();
        getDebitCreditIsNotOk();
        System.out.println("Pay salary");
    }
}
