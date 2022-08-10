package oop.io.zip;

import java.io.Serializable;

public class Car implements Serializable {
    private Engine engine;
    private Transmission transmission;
    private String brand;
    private String model;

    public Car(Engine engine, Transmission transmission, String brand, String model) {
        this.engine = engine;
        this.transmission = transmission;
        this.brand = brand;
        this.model = model;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Car)) {
            return false;
        }
        Car temp = (Car) obj;
        return this.engine.equals(temp.engine) && this.transmission.equals(temp.transmission) &&
                this.brand.equals(temp.brand) && this.model.equals(temp.model);
    }

    @Override
    public int hashCode(){
        int hashCode = 7;
        hashCode = 7 * hashCode + engine.hashCode();
        hashCode = 7 * hashCode + transmission.hashCode();
        hashCode = 7 * hashCode + brand.hashCode();
        hashCode = 7 * hashCode + model.hashCode();
        return hashCode;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", transmission=" + transmission +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
