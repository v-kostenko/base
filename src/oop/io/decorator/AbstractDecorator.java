package oop.io.decorator;

public abstract class AbstractDecorator implements IWidget{
    private IWidget widget;

    public AbstractDecorator(IWidget widget){
        this.widget = widget;
    }

    public void setWidget(IWidget widget){
        this.widget = widget;
    }

    @Override
    public void draw(){
        widget.draw();
    }
}
