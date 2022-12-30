package oop.multyThreading.carFactory;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Parking {
    private Car[] parkingArray = new Car[2];
    private BufferedWriter writer;

    public Parking(BufferedWriter writer){
        this.writer = writer;
    }

    public boolean isEmpty(){
        for (int i = 0; i < parkingArray.length; i++) {
            if (parkingArray[i] == null){
                return true;
            }
        }
        return false;
    }

    public synchronized boolean isFull(){
        for (int i = 0; i < parkingArray.length; i++) {
            if (parkingArray[i] == null){
                return false;
            }
        }
        return true;
    }


    public synchronized void putCar(Car car){
        try {
            for (int i = 0; i < parkingArray.length; i++) {
                if (parkingArray[i] == null) {
                    parkingArray[i] = car;
                    synchronized (System.out){
                        System.out.printf(car + " was put to the parking.\n");
                    }
                    synchronized (writer){
                        writer.append(car + " was put to the parking.\n");
                    }
                    return;
                }
            }
        } catch (IOException io){
            io.printStackTrace();
        }
    }

    public synchronized Car[] getCarsArray(){
        Car[] temp = new Car[parkingArray.length];
        System.arraycopy(parkingArray, 0, temp, 0, parkingArray.length);
        for (int i = 0; i < parkingArray.length; i++) {
            parkingArray[i] = null;
        }
        return temp;
    }
 }
