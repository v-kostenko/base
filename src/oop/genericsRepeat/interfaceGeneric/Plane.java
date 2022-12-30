package oop.genericsRepeat.interfaceGeneric;

public abstract class Plane {
    private String text;
    private int amount;

    public Plane(String text, int amount) {
        this.text = text;
        this.amount = amount;
    }

    public abstract <T> T get(int amount);
}
