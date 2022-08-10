package oop.interfaces.contactWindow;

public class Supplier extends ContactImpl{
    private double averageSupplierPrice;

    public Supplier(String name, String address, int phone, String email, String type, double averageSupplierPrice) {
        super(name, address, phone, email, type);
        this.averageSupplierPrice = averageSupplierPrice;
    }

    private void showAverageSupplierPrice(){
        System.out.println("My average price is " + averageSupplierPrice);
    }

    public double getAverageSupplierPrice(){
        return averageSupplierPrice;
    }
}
