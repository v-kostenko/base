package oop.multyThreading.synchro.wait_notify.shop;

public class Product {
    private String brand;
    private String type;
    private int price;
    private long serNumb;

    public Product(String brand, String type, int price, long serNumb){
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.serNumb = serNumb;
    }

    public String getType (){
        return type;
    }

    public String getBrand(){
        return brand;
    }

    public String toString(){
        return brand + " " + type + " " + serNumb;
    }




}
