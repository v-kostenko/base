package oop.io.systemBox;

import java.io.Serializable;

public class VideoCart implements Serializable {
    private String brand;
    private double price;

    public VideoCart(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "VideoCart{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
