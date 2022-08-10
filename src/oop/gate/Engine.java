package oop.gate;

public class Engine {
    private int direction = 1; // 1 to the right; 0 to the left
    private Gate gate;

    public void connectGate(Gate gate) {
        this.gate = gate;
    }

    public void rotate() {
        if (direction == 0) {
            direction = 1;
            turnEngineLeft();
        } else {
            direction = 0;
            turnEngineRight();
        }
    }

    private void turnEngineRight() {
        System.out.println("Engine starts moving to the right");
        gate.openGate();
    }

    private void turnEngineLeft() {
        System.out.println("Engine starts moving to the left");
        gate.closeGate();
    }


}
