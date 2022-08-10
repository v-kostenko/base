package oop.inheritance.compario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("Vasya");
        str.add("Petia");
        Collections.addAll(str, "Ben", "Summer", "IceCream", "Toy");
        String text = new String(new char[]{'B', 'e', 'n'});

        System.out.println(str.contains("IceCream"));
        System.out.println(str.remove("Toy"));
        System.out.println(str.indexOf("Ben"));
        System.out.println( str.contains(text));

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Hello");
        map.put(2, "World");
        map.put(1, "Java");

        System.out.println(map.size());

        Gearbox gearbox1 = new Gearbox(180, "AUTO", "BMW_GEAR");
        Gearbox gearbox2 = new Gearbox(180, "AUTO", "BMW_GEAR");
        Gearbox myGearbox = new Gearbox(777, "MY", "MyBrand");

        Motor motor1 = new Motor(3000, "BMW_MOTOR", 1500, "AUTO_MOTOR");
        Motor motor2 = new Motor(3000, "BMW_MOTOR", 1500, "AUTO_MOTOR");
        Motor myMotor = new Motor(1111, "MyMotor", 111, "MyType");

        Car car1 = new Car("BMW", "X6", 100000, 10, gearbox1, motor1);
        Car car2 = new Car("BMW", "X6", 100000, 10, gearbox2, motor2);
        Car myCar = new Car("MyCar", "Q7", 222222, 888, myGearbox, myMotor);

        ArrayList<Car> cars = new ArrayList<>();
        Collections.addAll(cars, car1, myCar);

        System.out.println("-------------------------");
        System.out.println(cars.contains(car2));
        System.out.println(cars.indexOf(car2));
        System.out.println(cars.remove(car2));
        System.out.println("-------------------------");

        HashMap<Car, Integer> carMap = new HashMap<>();
        carMap.put(car1, 1);
        carMap.put(car2, 2);
        carMap.put(myCar, 3);

        System.out.println(carMap.size());

        ArrayList<Date> dates = new ArrayList<>();
        Date date1 = new Date(22,4,5);
        Date date2 = new Date(22,4,5);

        dates.add(date1);
        System.out.println(dates.contains(date2));

        System.out.println(car1.equals(car2));
        System.out.println(date1.equals(date2));

        System.out.println("Hash code");
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());

        System.out.println("Dates");
        System.out.println(date1.hashCode());
        System.out.println(date2.hashCode());
    }
}
