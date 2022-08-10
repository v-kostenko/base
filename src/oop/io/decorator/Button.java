package oop.io.decorator;

public class Button implements IWidget {
    private double height;
    private double length;
    private double radius;

    public Button(double height, double length, double radius) {
        this.height = height;
        this.length = length;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw(){
        System.out.println("Button with height " + height + " \nLenght " + length + "\nRadius " + radius + " is driwen");
    }
}
