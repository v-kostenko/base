package oop.interfaces.computer;

import oop.exceptions.car.Car;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();

        Phone phone = new Phone("iPhone 13", 256);
        Cow cow = new Cow("Burenka", 130.5, 3);
        CarBMW car = new CarBMW("BMW", 2000, 122345);

        Display display1 = new Display("HP1", 24.6, 23.2);
        Display display2 = new Display("HP2", 24.6, 23.2);
        Projector projector = new Projector("Dell", 30.78, 12.5, 300);

        computer.connectDisplay(display1);
        computer.connectDisplay(display2);
        computer.connectDisplay(projector);

        computer.connectDevice(phone);
        computer.connectDevice(cow);
        computer.connectDevice(car);
        computer.selectDevice();







    }
}
