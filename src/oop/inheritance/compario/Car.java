package oop.inheritance.compario;

public class Car {
    private String brand;
    private String model;
    private double price;
    private double size;
    private Gearbox gearbox;
    private Motor motor;


    public Car(String brand, String model, double price, double size, Gearbox gearbox, Motor motor) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.size = size;
        this.gearbox = gearbox;
        this.motor = motor;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof Car)) {
            return false;
        }
        Car temp = (Car) object;
        return this.brand.equals(temp.brand) && this.model.equals(temp.model) &&
                this.price == temp.price && this.size == temp.size && this.gearbox.equals(temp.gearbox) &&
                this.motor.equals(temp.motor) ;
    }

    public int hashCode(){
        int hashCode = 7;
        hashCode = 7 * hashCode + brand.hashCode();
        hashCode = 7 * hashCode + model.hashCode();
        hashCode = 7 * hashCode + Double.hashCode(price);
        hashCode = 7 * hashCode + Double.hashCode(size);
        hashCode = 7 * hashCode + gearbox.hashCode();
        hashCode = 7 * hashCode + motor.hashCode();
        return hashCode;
    }
}
