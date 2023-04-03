package patterns.decorator.widgets;

public class ShadowDecorator extends AbstractWidgetDecorator {
    private int transparansy = 50;

    public ShadowDecorator(Widget widget) {
        super(widget);
    }

    @Override
    public void draw() {
        System.out.println("ShadowDecorator with transparansy " + transparansy + " has been drawn.");
        super.draw();
    }
}
