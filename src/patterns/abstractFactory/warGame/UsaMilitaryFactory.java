package patterns.abstractFactory.warGame;

public class UsaMilitaryFactory extends MilitaryFactory {


    @Override
    public Tank createTank() {
        return new AbramsTank(100, 9000, 2500, 3000, 4);
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
