package patterns.abstractFactory.warGame;

public class RussiaMilitaryFactory extends MilitaryFactory{
    @Override
    public Tank createTank() {
        return new T_34Tank(70, 5000, 1500, 1500, "Swamp");
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
