package oop.inheritance.shop;

public class Milk extends Food{
    private boolean isOrganic;

    public Milk(String title, double price, String expDate, boolean isOrganic){
        super(title, price, expDate,10, 5, 1);
        this.isOrganic = isOrganic;
    }

    public String toString(){
        return super.toString() + "\nOrganic: " + isOrganic + "\n";
    }
}
