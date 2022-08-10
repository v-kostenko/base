package oop.generics.base.repeat;

public abstract class Product {
    private double price;
    private String title;

    public Product(double price, String title) {
        this.price = price;
        this.title = title;
    }

    public double getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", title='" + title + '\'' +
                '}';
    }
}
