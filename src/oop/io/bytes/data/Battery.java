package oop.io.bytes.data;

public class Battery {
    private String brand;
    private int capacity;
    private double size;

    public Battery(String brand, int capacity, double size) {
        this.brand = brand;
        this.capacity = capacity;
        this.size = size;
    }

    public Battery( int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "brand='" + brand + '\'' +
                ", capacity=" + capacity +
                ", size=" + size +
                '}';
    }
}
