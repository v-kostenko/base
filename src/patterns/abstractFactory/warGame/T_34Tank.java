package patterns.abstractFactory.warGame;

public class T_34Tank extends Tank{
    private String сamouflage;

    public T_34Tank(int speed, double weight, int power, int shotDistance, String сamouflage) {
        super(speed, weight, power, shotDistance);
        this.сamouflage = сamouflage;
    }

    @Override
    public void shot() {

    }

    @Override
    public void takeAim() {

    }
}
