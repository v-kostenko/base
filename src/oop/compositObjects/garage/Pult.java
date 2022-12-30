package oop.compositObjects.garage;

public class Pult {
    private Detector detector;

    public void connectDetector(Detector detector){
        this.detector = detector;
    }

    public void pressButton(){
        detector.receiveSignal();
    }

}
