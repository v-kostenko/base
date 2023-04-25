package patterns.abstractFactory.warGame;

public class AircraftCarrier extends Warship {
    private int fighterCapacity;

    public AircraftCarrier(int length, int speed, int crew, int fighterCapacity, String name) {
        super(length, speed, crew, name);
        this.fighterCapacity = fighterCapacity;
    }

    @Override
    public void shot() {

    }

    @Override
    public void dropAnchor() {
        speed = 0;
        System.out.println("Anchor was drop");
    }


}
