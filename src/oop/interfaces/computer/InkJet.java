package oop.interfaces.computer;

public class InkJet extends PrinterImpl{
    private double capacityOfPaint;

    public InkJet(String model, int speedOfPrint, String material, double capacityOfPaint) {
        super(model, speedOfPrint, material);
        this.capacityOfPaint = capacityOfPaint;
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
