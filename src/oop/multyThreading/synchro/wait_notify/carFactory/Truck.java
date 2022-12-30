package oop.multyThreading.synchro.wait_notify.carFactory;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Truck extends Thread {
    private Car[] truckArray = new Car[8];
    private List<Parking> parkingsList = new ArrayList<>();
    private BufferedWriter writer;
    private Ship ship;
    private List<Car> duplicate;

    public Truck(BufferedWriter writer, Ship ship, List<Car> duplicate) {
        this.writer = writer;
        this.ship = ship;
        this.duplicate = duplicate;
    }

    public Car[] getTruckArray() {
        return truckArray;
    }

    public void addParking(Parking parking) {
        parkingsList.add(parking);
    }

    public boolean isTruckArrayFull() {
        for (int i = 0; i < truckArray.length; i++) {
            if (truckArray[i] == null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        while (true) {
            try {
                for (Parking park : parkingsList) {
                    if (park.isFull()) {
                        Car[] list = park.getCarsArray();
                        //System.out.println("List park.getCarsArray() " + Arrays.toString(list));
                        for (int j = 0, k = 0; j < truckArray.length && k < list.length; j++) {
                            if (truckArray[j] == null) {
                                truckArray[j] = list[k++];
                                synchronized (System.out) {
                                    System.out.println(truckArray[j] + " was added to the truck.");
                                }
                                synchronized (writer) {
                                    writer.append(truckArray[j] + " was added to the truck.\n");
                                }
                            }
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException inter) {
                                inter.printStackTrace();
                            }
                        }
                        if (isTruckArrayFull()) {
                            break;
                        }
                    }
                }
                if (!isTruckArrayFull()) {
                    continue;
                }
                //System.out.println("Truck array " + Arrays.toString(truckArray));
                for (int i = 0; i < truckArray.length; i++) {
                    try {
                        ship.addCarToTheSip(truckArray[i]);
                    } catch (CarExeption carExeption) {
                        duplicate.add(truckArray[i]);
                        synchronized (System.out) {
                            System.out.println(carExeption.getMessage() + " and go to duplicate list");
                        }
                        synchronized (writer) {
                            writer.append(carExeption.getMessage() + " and go to duplicate list");
                        }
                    }
                    truckArray[i] = null;
                }
            } catch (IOException io) {
                io.printStackTrace();
            }
        }
    }


}
