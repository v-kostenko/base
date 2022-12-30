package oop.multyThreading.synchro.wait_notify.shop;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Random;

public class Client extends Thread{
    private String name;
    private int sleepLimSec;
    private BufferedWriter writer;
    private Shop shop;

    public Client(String name, int sleepLimSec, BufferedWriter writer, Shop shop){
        this.name = name;
        this.sleepLimSec = sleepLimSec;
        this.writer = writer;
        this.shop = shop;
    }

    @Override
    public void run(){
        Random random = new Random();
        int i = 0;
        while (true) {
            try {
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
                    Thread.sleep((random.nextInt(sleepLimSec) + 1) * 1000);
            } catch (IOException | InterruptedException io) {
                io.printStackTrace();
            }
        }


    }


}
