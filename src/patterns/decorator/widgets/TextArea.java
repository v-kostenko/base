package patterns.decorator.widgets;

public class TextArea implements Widget {
    private String text;

    public TextArea(String text) {
        this.text = text;
    }

    @Override
    public void draw() {
        System.out.println("Text area " + text + " has been drawn.");
    }

}
