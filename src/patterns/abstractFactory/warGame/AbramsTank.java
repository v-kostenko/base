package patterns.abstractFactory.warGame;

public class AbramsTank extends Tank{
    private int crew;

    public AbramsTank(int speed, double weight, int power, int shotDistance, int crew) {
        super(speed, weight, power, shotDistance);
        this.crew = crew;
    }

    @Override
    public void shot() {

    }

    @Override
    public void takeAim() {

    }
}
