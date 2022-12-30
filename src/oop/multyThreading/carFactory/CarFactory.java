package oop.multyThreading.carFactory;

import java.util.Random;

public class CarFactory extends Thread{
    private String name;
    private int limGen;
    private Parking parking;

    public CarFactory(String name, int limGen, Parking parking){
        this.name = name;
        this.limGen = limGen;
        this.parking = parking;
    }

    @Override
    public void run(){
        try {
            Random random = new Random();
            int result = random.nextInt(limGen + 1);

            while (true) {
                if (!parking.isFull()) {
                    Car car = new Car(name, random.nextInt(40));
                    parking.putCar(car);
                }
                Thread.sleep(result * 500);
            }
        } catch (InterruptedException in){
            in.printStackTrace();
        }


    }








}
