package oop.io.systemBox;

import java.io.Serializable;

public class Processor implements Serializable {
    private double price;
    private String brand;

    public Processor(double price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }
}
