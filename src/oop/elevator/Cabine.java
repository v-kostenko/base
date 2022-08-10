package oop.elevator;

public class Cabine {
    private int currentFloor = 0;

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void openDoore() {
        System.out.println("Dore is open on the " + currentFloor + " floor.");
    }

    public void setCurrentFlor(int currentFloor) {
        this.currentFloor = currentFloor;
    }
}
