package oop.multyThreading.synchro.wait_notify.shop;

import oop.multyThreading.synchro.shop.Product;
import oop.multyThreading.synchro.shop.Shop;

import java.util.Random;

public class Supplier extends Thread{
    private String brand;
    private int limitSec;
    private static int[][] dictionary = {{1300, 2500, 300}, {1250, 2000, 200}, {900, 1000, 100}};
    private Shop shop;
    private long serNumber = 1;

    public Supplier(String brand, int limitSec, Shop shop){
        this.brand = brand;
        this.limitSec = limitSec;
        this.shop = shop;
    }



    @Override
    public void run(){
        Random random = new Random();
        while (true){

            int type = random.nextInt(3);
            String productType = "";
            if (type == 0){
                productType = "phone";
            } else if (type == 1) {
                productType = "Laptop";
            } else {
                productType = "Headphonse";
            }

            int price = 0;
            if (brand.equals("Apple")){
                price = dictionary[0][type];
            } else if (brand.equals("Samsung")) {
                price = dictionary[1][type];
            } else if (brand.equals("Xiomi")) {
                price = dictionary[1][type];
            }

            oop.multyThreading.synchro.shop.Product product = new Product(brand, productType, price, serNumber++);
            shop.addProduct(product);
            try{
                Thread.sleep((random.nextInt(limitSec) + 1) * 1000);
            } catch (InterruptedException ie){

            }

        }
    }






}
