package oop.blander;

public class Cup {
    private double sizeCup;
    private int number;

    public Cup(double sizeCup, int number){
        this.sizeCup = sizeCup;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getSize() {
        return sizeCup;
    }

    public void setSize(double sizeCup) {
        this.sizeCup = sizeCup;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "sizeCup=" + sizeCup +
                ", number=" + number +
                '}';
    }
}
