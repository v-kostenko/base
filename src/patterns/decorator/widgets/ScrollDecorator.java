package patterns.decorator.widgets;

public class ScrollDecorator extends AbstractWidgetDecorator{
    private String type = "Vertical";

    public ScrollDecorator(Widget widget){
        super(widget);
    }


    @Override
    public void draw(){
        System.out.println("ScrollDecorator with type " + type + " has been drawn.");
        super.draw();
    }
}
