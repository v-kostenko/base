package patterns.abstractFactory.warGame;

public abstract class WarPlane {
    private int speed;
    private int altitudeFly;
    private int fkyDistance;

    public WarPlane(int speed, int altitudeFly, int fkyDistance) {
        this.speed = speed;
        this.altitudeFly = altitudeFly;
        this.fkyDistance = fkyDistance;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAltitudeFly() {
        return altitudeFly;
    }

    public int getFkyDistance() {
        return fkyDistance;
    }

    public abstract void bomb();

    public abstract void takeOff();

    public abstract void land();
}
