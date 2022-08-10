package oop.io.zip;

public class Main {
    public static void main(String[] args) {

        Engine engine = new Engine(128, "Mitsubushi");
        Transmission transmission = new Transmission(5, Type.MECHANICKS);

        Engine engine2 = new Engine(1282, "Mitsubushi2");
        Transmission transmission2 = new Transmission(52, Type.AUTOMAT);


        Car car1 = new Car(engine, transmission, "Reno1", "1211/3");
        Car car2 = new Car(engine2, transmission2, "Reno2", "1222/3");

        ControllerCar.create(car1);
        ControllerCar.create(car2);

        System.out.println( ControllerCar.read());

        ControllerCar.delete(car1);
        System.out.println(ControllerCar.read());





    }
}
