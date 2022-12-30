package oop.multyThreading.carFactory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("carFactory.txt"))){
            List<Car> duplicate = new ArrayList<>();
            Parking parking = new Parking(writer);
            Parking parking2 = new Parking(writer);
            Ship ship = new Ship(writer);
            Buksir buksir = new Buksir(ship, writer);

            Thread threadBMW = new Thread(new CarFactory("BMW", 3, parking));
            Thread threadMersedes = new Thread(new CarFactory("Mersedes", 2, parking));
            Thread threadShkoda = new Thread(new CarFactory("Shkoda", 3, parking2));

            Truck truck = new Truck(writer, ship, duplicate);
            truck.addParking(parking);
            truck.addParking(parking2);

            Thread threadTruck = new Thread(truck);
            threadTruck.setDaemon(true);

            Thread buksirThread = new Thread(buksir);
            buksirThread.setDaemon(true);


            threadBMW.setDaemon(true);
            threadMersedes.setDaemon(true);
            threadShkoda.setDaemon(true);

            threadBMW.start();
            threadMersedes.start();
            threadShkoda.start();
            threadTruck.start();
            buksirThread.start();


            Thread.sleep(25000);
        } catch (IOException ioe){
            ioe.printStackTrace();
        } catch (InterruptedException inter){
            inter.printStackTrace();
        }













    }
}
