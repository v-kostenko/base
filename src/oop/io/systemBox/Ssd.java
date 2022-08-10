package oop.io.systemBox;

import java.io.Serializable;

public class Ssd implements Serializable {
    private int capacity;
    private double width;
    private double length;

    public Ssd(int capacity, double width, double length){
        this.capacity = capacity;
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Ssd{" +
                "capacity=" + capacity +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
