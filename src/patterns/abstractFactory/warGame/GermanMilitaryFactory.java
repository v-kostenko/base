package patterns.abstractFactory.warGame;

public class GermanMilitaryFactory extends MilitaryFactory{
    @Override
    public Tank createTank() {
        return new LeopardTank(80, 10000, 2500, 2000, 50);
    }

    @Override
    public Warship createWarship() {
        return null;
    }

    @Override
    public WarPlane createWarplane() {
        return null;
    }
}
