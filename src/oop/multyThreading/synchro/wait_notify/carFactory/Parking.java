package oop.multyThreading.synchro.wait_notify.carFactory;

import java.io.BufferedWriter;
import java.io.IOException;

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
        boolean isFull = true;
        for (int i = 0; i < parkingArray.length; i++) {
            if (parkingArray[i] == null){
                isFull = false;
            }
        }
        try {
            if (isFull) {
                wait();
            }
            for (int i = 0; i < parkingArray.length; i++) {
                if (parkingArray[i] == null) {
                    parkingArray[i] = car;
                    synchronized (System.out){
                        System.out.printf(car + " was put to the parking.\n");
                    }
                    synchronized (writer){
                        writer.append(car + " was put to the parking.\n");
                    }
                    notifyAll();
                    return;
                }
            }
        } catch (InterruptedException interruptedException){
            interruptedException.printStackTrace();
        } catch (IOException ioException){
            ioException.printStackTrace();
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
