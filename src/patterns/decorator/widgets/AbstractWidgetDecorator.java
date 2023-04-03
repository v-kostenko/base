package patterns.decorator.widgets;

public abstract class AbstractWidgetDecorator implements Widget {
    private Widget widget;

    public AbstractWidgetDecorator(Widget widget) {
        this.widget = widget;
    }

    @Override
    public void draw(){
        widget.draw();
    }

    public void setWidget(Widget widget){
        this.widget = widget;
    }

}
