package oop.compositObjects.garage;

public class Main {
    public static void main(String[] args) {
        Detector detector = new Detector();

        Pult pult = new Pult();
        pult.connectDetector(detector);

        Motor motor = new Motor();
        Rollete rollete = new Rollete();

        detector.connectMotor(motor);
        motor.connectRollete(rollete);

        pult.pressButton();
        pult.pressButton();
        pult.pressButton();
        pult.pressButton();





    }
}
