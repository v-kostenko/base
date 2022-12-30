package oop.multyThreading.synchro.shop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Random;

public class Client implements Runnable {
    private String name;
    private int limSec;
    private Shop shop;
    private int lim;
    private BufferedWriter writer;

    public Client(String name, int limSec, BufferedWriter writer, int lim, Shop shop) {
        this.limSec = limSec;
        this.name = name;
        this.writer = writer;
        this.lim = lim;
        this.shop = shop;
    }

    @Override
    public void run() {
        Random random = new Random();
        int i = 0;
        while (true) {
            try {
                if (!shop.isEmpty()) {
                    int resultType = random.nextInt(3);
                    String deviceType = "";
                    if (resultType == 0) {
                        deviceType = "phone";
                    } else if (resultType == 1) {
                        deviceType = "Laptop";
                    } else {
                        deviceType = "Headphonse";
                    }

                    int resultBrand = random.nextInt(3);
                    String brand = "";
                    if (resultType == 0) {
                        brand = "Apple";
                    } else if (resultType == 1) {
                        brand = "Samsung";
                    } else {
                        brand = "Xiomi";
                    }
                    i++;
                    Product product = shop.getProduct(brand, deviceType);
                    synchronized (writer){
                        writer.append(name + " ask for " + deviceType + " " + brand + " got " + ((product != null) ? product : "Nothing" + "\n"));
                    }
                    synchronized (System.out){
                        System.out.println(name + " ask for " + deviceType + " " + brand + " got " + ((product != null) ? product : "Nothing"));
                    }
                    Thread.sleep((random.nextInt(limSec) + 1) * 1000);
                }
            } catch (IOException | InterruptedException io) {
                io.printStackTrace();
            }
        }
    }



}
