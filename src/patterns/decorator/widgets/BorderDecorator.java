package patterns.decorator.widgets;

public class BorderDecorator extends AbstractWidgetDecorator{
    private String type = "Solid";
    private String color = "Black";

    public BorderDecorator(Widget widget){
        super(widget);
    }

    @Override
    public void draw(){
        System.out.println("Border " + type + " with color " + color + " has been drawn");
        super.draw();
    }


}
