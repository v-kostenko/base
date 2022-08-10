package oop.gate;

public class Main {
    public static void main(String[] args) {
        Remote remote = new Remote();
        Detector detector = new Detector();
        Engine engine = new Engine();
        Gate gate = new Gate();

        remote.connectDetector(detector);
        detector.connectEngine(engine);
        engine.connectGate(gate);

        remote.pressButton();
        System.out.println();
        remote.pressButton();
        System.out.println();
        remote.pressButton();

    }




}
