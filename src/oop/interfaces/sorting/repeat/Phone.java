package oop.interfaces.sorting.repeat;

public class Phone implements Comparable<Phone> {
    private Battery battery;
    private String brand;
    private double price;
    private long serNumber;

    public Phone(Battery battery, String brand, double price, long serNumber) {
        this.battery = battery;
        this.brand = brand;
        this.price = price;
        this.serNumber = serNumber;
    }

    public double getPrice(){
        return price;
    }

    @Override
    public int compareTo(Phone phone) {
        //return  - (this.brand.length() - phone.brand.length());
        //return - Double.compare(this.price, phone.price);
        //return - Long.compare(this.serNumber, phone.serNumber);
        return this.battery.compareTo(phone.battery);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "battery=" + battery +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", serNumber=" + serNumber +
                '}';
    }
}
