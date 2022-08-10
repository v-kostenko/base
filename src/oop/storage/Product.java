package oop.storage;

import java.util.Scanner;

public class Product {
    private String brand;
    private String title;
    private double price;
    private double amount;


    Product(String brand, String title, double price, double amount){
        this.brand = brand;
        this.title = title;
        this.price = price;
        this.amount = amount;
    }

    Product(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Заполните инвормацию о продукте. \nВедите бренд продукта");
        String brand = scanner.next();
        this.brand = brand;

        System.out.println("Укажите тайтл продукта");
        String title = scanner.next();
        this.title = title;

        System.out.println("Укажите цену продукта");
        Double price = scanner.nextDouble();
        this.price = price;

        System.out.println("Укажите количество товара");
        Double amount = scanner.nextDouble();
        this.amount = amount;
    }

    public String getBrand(){
        return brand;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getAmount(){
        return amount;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public void getInfo(){

    }

}
