package oop.compositObjects.phone;

public class SimCart {
    private int balance;
    private double tariff;
    private String provider;

    public SimCart(int balance, double tariff, String provider){
        this.balance = balance;
        this.tariff = tariff;
        this.provider = provider;
    }

    public int getBalance(){
        return balance;
    }

    public void addMoney(int money){
        balance = balance + money;
    }




}
