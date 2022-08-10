package oop.io.decorator;

public class BorderDecorator extends AbstractDecorator {
    private String color = "Red";
    private String type = "Border";

    public BorderDecorator(IWidget widget) {
        super(widget);
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Border Decorator is drown.\nColor " + color + "\nType " + type);
    }
}
