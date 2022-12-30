package oop.multyThreading.synchro.shop;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("orders.txt", true));
            Shop shop = new Shop(6, writer);

            Thread threadApple = new Thread(new Supplier("Apple", 3, shop));
            Thread threadSamsung = new Thread(new Supplier("Samsung", 2, shop));
            Thread threadXiomi = new Thread(new Supplier("Xiomi", 3, shop));

            Thread threadVasya = new Thread(new Client("Vasya", 3, writer, 10, shop));
            Thread threadIvan = new Thread(new Client("Ivan", 2, writer, 10, shop));

            threadApple.setDaemon(true);
            threadSamsung.setDaemon(true);
            threadXiomi.setDaemon(true);

            threadApple.start();
            threadSamsung.start();
            threadXiomi.start();

            threadIvan.setDaemon(true);
            threadVasya.setDaemon(true);

            threadVasya.start();
            threadIvan.start();

//            threadApple.join();
//            threadSamsung.join();
//            threadXiomi.join();

            //threadIvan.join();
           // threadVasya.join();

            Thread.sleep(20000);
            writer.close();
        } catch (IOException io) {
            io.printStackTrace();
        } catch (InterruptedException iot){

        }




    }
}
