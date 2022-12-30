package oop.statics.enums;

enum EngineType {
    DIESEL, OIL, PETROL
}

public enum Engine {
    V8_D_35(3.5, 2, EngineType.OIL),
    DI_2_20(4.0, 5, EngineType.PETROL),
    DI_78_25(4.5, 10, EngineType.DIESEL);

    private double volume;
    private int power;
    private EngineType type;

    Engine(double volume, int power, EngineType type) {
        this.volume = volume;
        this.power = power;
        this.type = type;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public EngineType getType() {
        return type;
    }

    public void setType(EngineType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", power=" + power +
                ", type=" + type +
                '}';
    }
}
