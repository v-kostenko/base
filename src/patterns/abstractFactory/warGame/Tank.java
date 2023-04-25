package patterns.abstractFactory.warGame;

public abstract class Tank {
    private int speed;
    private double weight;
    private int power;
    private int shotDistance;

    public Tank(int speed, double weight, int power, int shotDistance) {
        this.speed = speed;
        this.weight = weight;
        this.power = power;
        this.shotDistance = shotDistance;
    }

    public int getSpeed() {
        return speed;
    }

    public double getWeight() {
        return weight;
    }

    public int getPower() {
        return power;
    }

    public int getShotDistance() {
        return shotDistance;
    }

    public abstract void shot();

    public abstract void takeAim();
}
