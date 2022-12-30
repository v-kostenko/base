package oop.multyThreading.synchro.shop;

import java.io.BufferedWriter;
import java.io.IOException;

public class Shop {
    private Product[] storage;
    private BufferedWriter writer;

    public Shop(int size, BufferedWriter writer) {
        storage = new Product[size];
        this.writer = writer;
    }

    public Product[] getStorage() {
        return storage;
    }

    public synchronized boolean isFull() {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                return false;
            }
        }
        return true;
    }

    public synchronized void addProduct(Product product) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                storage[i] = product;

                synchronized (System.out){
                    System.out.println(product + " was added to the array.");
                }
                try {
                    synchronized (writer){
                        writer.append(product + " was added to the array.\n");
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                return;
            }
        }
    }

    public synchronized boolean isEmpty() {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null) {
                return false;
            }
        }
        return true;
    }

    public synchronized Product getProduct(String brand, String type) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null && storage[i].getType().equals(type) && storage[i].getBrand().equals(brand)) {
                Product find = storage[i];
                storage[i] = null;
                return find;
            }
        }
        return null;
    }


}
