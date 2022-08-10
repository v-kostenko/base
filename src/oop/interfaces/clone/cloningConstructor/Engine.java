package oop.interfaces.clone.cloningConstructor;

public class Engine {
    private int volume;
    private double price;
    private String model;

    public Engine(int volume, double price, String model) {
        this.volume = volume;
        this.price = price;
        this.model = model;
    }

    public Engine(Engine engineOriginal){
        //Engine engineCopy = new Engine(volume, price, model);
        this.volume = engineOriginal.volume;
        this.price = engineOriginal.price;
        this.model = engineOriginal.model;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", price=" + price +
                ", model='" + model + '\'' +
                '}';
    }
}
