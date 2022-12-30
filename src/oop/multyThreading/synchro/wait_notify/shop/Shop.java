package oop.multyThreading.synchro.wait_notify.shop;

import java.io.BufferedWriter;
import java.io.IOException;

public class Shop {
    private BufferedWriter writer;
    private Product[] storage;

    public Shop(BufferedWriter writer, int size) {
        this.writer = writer;
        this.storage = new Product[size];
    }

    public synchronized void addProduct(Product product) {
        boolean isFull = true;
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                isFull = false;
                break;
            }
        }
        try {
            if (isFull) {
                wait();
            }
            for (int i = 0; i < storage.length; i++) {
                if (storage[i] == null) {
                    storage[i] = product;

                    synchronized (System.out) {
                        System.out.println(product + " was added to the array.");
                    }
                    try {
                        synchronized (writer) {
                            writer.append(product + " was added to the array.\n");
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    notifyAll();
                    return;
                }
            }
        } catch (InterruptedException inter) {
            inter.printStackTrace();
        }
    }


    public synchronized Product getProduct(String brand, String type) {
        boolean isEmpty = true;
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null) {
                isEmpty = false;
                break;
            }
        }
        try {
            if (isEmpty) {
                wait();
            }
            for (int i = 0; i < storage.length; i++) {
                if (storage[i] != null && storage[i].getType().equals(type) && storage[i].getBrand().equals(brand)) {
                    Product find = storage[i];
                    storage[i] = null;
                    notifyAll();
                    return find;
                }
            }
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        notifyAll();
        return null;


    }
}
