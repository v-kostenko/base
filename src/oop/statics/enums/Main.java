package oop.statics.enums;

import java.util.Locale;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(Color.BLACK, Transmission.MANUAL, Engine.DI_2_20, "BMW");
        System.out.println(car.toString());

        Transmission.MANUAL.setSpeed(999);
        System.out.println(car);

        Random random = new Random();
        Engine[] engines = Engine.values();

        int x = random.nextInt(engines.length);
        System.out.println(engines[x]);

        String str = "di_2_20";
        Engine engine = Engine.valueOf(str.toUpperCase());
        System.out.println(engine);


    }
}
