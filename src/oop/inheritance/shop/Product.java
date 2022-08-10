package oop.inheritance.shop;

public abstract class Product {
    private String title;
    private double price;

    public Product(String title, double price){
        this.title = title;
        this.price = price;
    }

    public String toString(){
        return " Title: " + title + "\nPrice: " + price + " hrn";
    }

}
