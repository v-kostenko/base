package oop.compositObjects.garage;

public class Detector {
    private Motor motor;

    public void connectMotor(Motor motor){
        this.motor = motor;
    }

    public void receiveSignal(){
        System.out.println("Detector receive signal from pult");
        motor.rotateMotor();
    }





}
