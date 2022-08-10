package oop.functionalProgramming;

public class Product {
    private String title;
    private double price;
    private int amount;
    private String brand;

    public Product(String title, double price, int amount, String brand) {
        this.title = title;
        this.price = price;
        this.amount = amount;
        this.brand = brand;
    }

    public double getPrice(){
        return price;
    }

    public double setPrice(double price){
        return this.price = price;
    }

    public double total(){
        return price * amount;
    }

    public int getAmount(){
        return amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", brand='" + brand + '\'' +
                '}';
    }
}
