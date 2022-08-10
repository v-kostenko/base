package oop.elevator;

public class Engine {
    private Cabine cabine;

    public void connectCabine(Cabine cabine){
        this.cabine = cabine;
    }

    public void liftUp(int floor) {
        System.out.println("Engine rotate  " + floor + " floors up." );
        cabine.setCurrentFlor(cabine.getCurrentFloor() + floor);

    }

    public void liftDown(int floor){
        System.out.println("Engine rotate  " + floor + " floors down." );
        cabine.setCurrentFlor(cabine.getCurrentFloor() - floor);
    }
}
