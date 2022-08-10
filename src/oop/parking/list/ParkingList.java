package oop.parking.list;

import oop.parking.car.Car;

import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Scanner;

public class ParkingList {
    private ArrayList<ArrayList<Car>> floors = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public ParkingList(){
        System.out.println("Сколько этажей?");
        int amountFloors = scanner.nextInt();

        for (int i = 0; i < amountFloors; i++) {
            System.out.println("Сколько паркомест на этаже " + i);
            int amount = scanner.nextInt();
            ArrayList<Car> floor = new ArrayList<>();

            for (int j = 0; j < amount; j++) {
                floor.add(null);
            }
            floors.add(floor);
         }

    }



}
