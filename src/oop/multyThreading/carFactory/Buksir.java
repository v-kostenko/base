package oop.multyThreading.carFactory;

import java.io.BufferedWriter;
import java.io.IOException;

public class Buksir extends Thread {
    private Ship ship;
    private BufferedWriter writer;

    public Buksir(Ship ship, BufferedWriter writer) {
        this.ship = ship;
        this.writer = writer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(2000);
                if (ship.shipIsFull()) {
                    ship.clearShip();
                    synchronized (System.out) {
                        System.out.println("Ship was cleared");
                    }
                    synchronized (writer) {
                        writer.append("Ship was cleared");
                    }
                }
            } catch (InterruptedException | IOException ioException){
                ioException.printStackTrace();
            }
        }
    }


}
