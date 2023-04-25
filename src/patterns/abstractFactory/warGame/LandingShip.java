package patterns.abstractFactory.warGame;

public class LandingShip extends Warship{
    private int soldierCapacity;

    public LandingShip(int length, int speed, int crew, int soldierCapacity, String name) {
        super(length, speed, crew, name);
        this.soldierCapacity = soldierCapacity;
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
