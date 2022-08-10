package oop.elevator;

public class Controller {
    private Cabine cabine;
    private Engine engine;
    private int floorAmount;

    public Controller(int floorAmount){
        this.floorAmount = floorAmount;
    }

    public void connectCabine(Cabine cabine) {
        this.cabine = cabine;
    }

    public void connectEngine(Engine engine) {
        this.engine = engine;
    }

    public void checkFloor(int floor) {

        if (floor > floorAmount || floor < 0) {
            System.out.println("Input correct floor");
            return;
        }

        if (floor == cabine.getCurrentFloor()) {
            cabine.openDoore();
        }

        if (floor > cabine.getCurrentFloor()) {
            engine.liftUp(floor - cabine.getCurrentFloor());
            cabine.openDoore();
        }

        if (floor < cabine.getCurrentFloor()) {
            engine.liftDown(cabine.getCurrentFloor() - floor);
            cabine.openDoore();
        }
    }

}
