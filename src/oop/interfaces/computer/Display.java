package oop.interfaces.computer;

public class Display extends DisplayImpl {
    private double diagonal;

    public Display(String model, double diagonal, double diagonal1) {
        super(model, diagonal);
        this.diagonal = diagonal1;
    }

    @Override
    public void display(String text) {
        System.out.println(getClass().getSimpleName() + " diagonal " + diagonal + " show text: \n" + text);
    }


}
