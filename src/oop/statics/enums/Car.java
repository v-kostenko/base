package oop.statics.enums;
enum Color{
    BLACK, WHITE, RED
}

public class Car {
    private Color color;
    private Transmission transmission;
    private Engine engine;
    private String brand;

    public Car(Color color, Transmission transmission, Engine engine, String brand) {
        this.color = color;
        this.transmission = transmission;
        this.engine = engine;
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", transmission=" + transmission +
                ", engine=" + engine +
                ", brand='" + brand + '\'' +
                '}';
    }
}
