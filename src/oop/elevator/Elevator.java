package oop.elevator;

public class Elevator {
    private Cabine cabine;
    private Engine engine;
    private Controller controller;

    public Elevator(int floorsAmount) {
        cabine = new Cabine();
        engine = new Engine();
        controller = new Controller(floorsAmount);
        controller.connectCabine(cabine);
        controller.connectEngine(engine);
        engine.connectCabine(cabine);
    }

    public void connectPult(Pult pult){
        pult.connectController(controller);
    }
}
