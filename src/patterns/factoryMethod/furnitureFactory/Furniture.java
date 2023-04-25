package patterns.factoryMethod.furnitureFactory;

public abstract class Furniture {
    private String color;
    private String material;
    private double price;

    public Furniture(String color, String material, double price) {
        this.color = color;
        this.material = material;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public double getPrice() {
        return price;
    }

    public abstract void creationalFlow();
}
