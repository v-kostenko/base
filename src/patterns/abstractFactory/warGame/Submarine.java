package patterns.abstractFactory.warGame;

public class Submarine extends Warship {
    private int divingDepth;

    public Submarine(int length, int speed, int crew, int divingDepth, String name) {
        super(length, speed, crew, name);
        this.divingDepth = divingDepth;
    }

    @Override
    public void shot() {

    }

    @Override
    public void dropAnchor() {

    }
}
