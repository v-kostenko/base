package patterns.decorator.widgets;

public class Main {
    public static void main(String[] args) {
        ShadowDecorator decorator = new ShadowDecorator(new Button("OK"));
        Widget widget = new BorderDecorator(new ScrollDecorator(decorator));
        widget.draw();

        System.out.println();
        //  ((AbstractWidgetDecorator)widget).setWidget(new TextArea("Text Area"));
        decorator.setWidget(new TextArea("Text Area"));
        widget.draw();


    }
}
