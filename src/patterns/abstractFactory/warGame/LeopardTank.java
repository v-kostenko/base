package patterns.abstractFactory.warGame;

public class LeopardTank extends Tank {
    private int armorThickness;

    public LeopardTank(int speed, double weight, int power, int shotDistance, int armorThickness){
        super(speed, weight, power, shotDistance);
        this.armorThickness = armorThickness;
    }

    @Override
    public void shot() {

    }

    @Override
    public void takeAim() {

    }
}
