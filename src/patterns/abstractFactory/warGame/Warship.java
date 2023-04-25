package patterns.abstractFactory.warGame;

public abstract class Warship {
    private int length;
    protected int speed;
    private int crew;
    private String name;

    public Warship(int length, int speed, int crew, String name) {
        this.length = length;
        this.speed = speed;
        this.crew = crew;
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public int getSpeed() {
        return speed;
    }

    public int getCrew() {
        return crew;
    }

    public abstract void shot();

    public abstract void dropAnchor();
}
