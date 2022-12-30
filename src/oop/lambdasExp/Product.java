package oop.lambdasExp;

public class Product {
    private double price;
    private String title;
    private int amount;

    public Product(double price, String title, int amount) {
        this.price = price;
        this.title = title;
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double total() {
        return this.price * this.amount;
    }
}
