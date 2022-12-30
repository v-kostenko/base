package oop.multyThreading.carFactory;

import java.io.BufferedWriter;
import java.io.IOException;

public class Ship {
    private Car[] shipArray = new Car[10];

    private BufferedWriter writer;

    public Ship(BufferedWriter writer) {
        this.writer = writer;
    }

    public synchronized void addCarToTheSip(Car car) throws CarExeption {
        int emptyBox = -1;
        for (int i = 0; i < shipArray.length; i++) {
            if (shipArray[i] == null && emptyBox == -1) {
                emptyBox = i;
            }
            if (shipArray[i] != null && shipArray[i].equals(car)) {
                throw new CarExeption("+++++ Car " + car.getBrand() + " with number " + car.getSerNumber() + " is on the ship ++++++");
            }
        }
        if (emptyBox != -1) {
            try {
                shipArray[emptyBox] = car;
                synchronized (System.out) {
                    System.out.println("Car " + car.getBrand() + " and ser. numb " + car.getSerNumber() + " was added to the ship ");
                }
                synchronized (writer) {
                    writer.append("Car " + car.getBrand() + " and ser. numb " + car.getSerNumber() + " was added to the ship ");
                }
            } catch (IOException io) {
                io.printStackTrace();
            }
        }
    }

    public synchronized boolean shipIsFull() {
        for (int i = 0; i < shipArray.length; i++) {
            if (shipArray[i] == null) {
                return false;
            }
        }
        return true;
    }

    public synchronized void clearShip() {
        for (int i = 0; i < shipArray.length; i++) {
            shipArray[i] = null;
        }
    }


}
