package oop.io.decorator;

public class ScrollDecorator extends AbstractDecorator{
    private String type;

    public ScrollDecorator(IWidget widget){
        super(widget);
    }

    public void setType(String type){
        this.type = type;
    }

    @Override
    public void draw(){
        super.draw();
        System.out.println("Scroll Decorator is drown.\nType " + type);
    }
}
