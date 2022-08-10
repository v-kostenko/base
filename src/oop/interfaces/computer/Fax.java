package oop.interfaces.computer;

public class Fax extends PrinterImpl{
    private double lengthOfPaper;

    public Fax(String model, int speedOfPrint, String material, double lengthOfPaper) {
        super(model, speedOfPrint, material);
        this.lengthOfPaper = lengthOfPaper;
    }

    @Override
    public void print(String text) {
        System.out.println("Fax prints: \n " + text);
    }
}
