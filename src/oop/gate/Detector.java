package oop.gate;

public class Detector {
    private Engine engine;

    public void connectEngine(Engine engine){
        this.engine = engine;
    }

    public void detectorActivation(){
        System.out.println("Detector get a signal.");
        engine.rotate();
    }


}
