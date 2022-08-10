package oop.gate;

public class Remote {
    private boolean button;
    private Detector detector;

    public void connectDetector(Detector d){
        this.detector = d;
    }

    public void pressButton() {
        button = !button;
        System.out.println("Button was pressed");
        detector.detectorActivation();
    }



}
