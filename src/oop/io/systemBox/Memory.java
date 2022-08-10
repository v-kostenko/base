package oop.io.systemBox;

import java.io.Serializable;

public class Memory implements Serializable {
    private int capacity;
    private String brand;
    private double price;

    public Memory(int capacity, String brand, double price) {
        this.capacity = capacity;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "capacity=" + capacity +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
