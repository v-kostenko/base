package patterns.decorator.widgets;

public class Button implements Widget{
    private String text;

    public Button(String text){
        this.text = text;
    }

    @Override
    public void draw(){
        System.out.println("Button with " + text + " has been drawn.");
    }

}
