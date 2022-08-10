package oop.interfaces.contactWindow;

public class Delivery extends ContactImpl{
    private double pricePerMile;

    public Delivery(String name, String address, int phone, String email, String type, double pricePerMile) {
        super(name, address, phone, email, type);
        this.pricePerMile = pricePerMile;
    }

    public void showPricePerMile(){
        System.out.println("My price is " + getPricePerMile());
    }

    public double getPricePerMile(){
        return this.pricePerMile;
    }

}
