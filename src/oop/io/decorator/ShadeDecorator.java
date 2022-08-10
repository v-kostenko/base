package oop.io.decorator;

public class ShadeDecorator extends AbstractDecorator {
    private String color;
    private int transparency;
    private double corner;

    public ShadeDecorator(IWidget widget){
        super(widget);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransparency(int transparency) {
        this.transparency = transparency;
    }

    public void setCorner(double corner) {
        this.corner = corner;
    }

    @Override
    public void draw(){
        super.draw();
        System.out.println("Shadow is drown. \nColor: " + color + "\nTransparancy " + transparency + "\nCorner " + corner );
    }

    public double setCorner(int corner){
        return Math.pow(corner, 2);
    }
}
