package oop.io.zip;

import java.io.Serializable;
import java.util.Objects;

public class Engine implements Serializable {
    private int capacity;
    private String brand;


    public Engine(int capacity, String brand) {
        this.capacity = capacity;
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return capacity == engine.capacity && Objects.equals(brand, engine.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity, brand);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "capacity=" + capacity +
                ", brand='" + brand + '\'' +
                '}';
    }
}
