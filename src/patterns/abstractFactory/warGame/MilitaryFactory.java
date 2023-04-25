package patterns.abstractFactory.warGame;

public abstract class MilitaryFactory {
    public abstract Tank createTank();
    public abstract Warship createWarship();
    public abstract WarPlane createWarplane();
}
