package oop.interfaces.clone.cloningConstructor;

public class Car {
    private String brand;
    private double price;
    private String color;
    private Engine engine;

    public Car(String brand, double price, String color, Engine engine) {
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.engine = engine;
    }

    public Car(Car carOriginal){
        //Car carCopy = new Car(brand, price, color, engine);
        this.brand = carOriginal.brand;
        this.price = carOriginal.price;
        this.color = carOriginal.color;

        this.engine = new Engine(carOriginal.engine);

    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
