package oop.statics.enums;

public enum Transmission {AUTOM_8T(8, "Automat"), AUTOM_6B(6, "Autom_6B"),
    MANUAL(1, "Manual");

    private int speed;
    private String type;

    Transmission(int speed, String type) {
        this.speed = speed;
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Transmission{" + super.toString() +
                "speed=" + speed +
                ", type='" + type + '\'' +
                '}';
    }
}
