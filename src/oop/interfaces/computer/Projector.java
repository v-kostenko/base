package oop.interfaces.computer;

public class Projector extends DisplayImpl{
    private double flashLighterSize;
    private double maxScale;

    public Projector(String model, double diagonal, double flashLighterSize, double maxScale) {
        super(model, diagonal);
        this.flashLighterSize = flashLighterSize;
        this.maxScale = maxScale;
    }

    @Override
    public void display(String text){
        System.out.println(getClass().getSimpleName() + " displays:\n " + text);
    }
}
