package oop.io.decorator;

public class TextArea implements IWidget{
    private double height;
    private double width;

    public TextArea(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void draw(){
        System.out.println("TextArea " + height + " x " + width + " is driwen");
    }


}
