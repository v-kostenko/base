package oop.io.decorator;

public class Main {
    public static void main(String[] args) {

        AbstractDecorator scrollDecorator = new ScrollDecorator(new TextArea(12.3, 23.6));

        IWidget widget = new BorderDecorator(new ShadeDecorator(scrollDecorator));
        widget.draw();

        System.out.println();
        scrollDecorator.setWidget(new Combobox<String>());
        widget.draw();

//        System.out.println();
//        ((AbstractDecorator) widget).setWidget(new Button(12.3, 12.3, 0.2));
//        widget.draw();






    }
}
