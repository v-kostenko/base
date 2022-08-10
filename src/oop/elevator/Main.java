package oop.elevator;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(5);
        Pult pult = new Pult();

        elevator.connectPult(pult);
//        pult.pressButton();
    }
}
