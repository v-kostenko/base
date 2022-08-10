package oop.interfaces.computer;

public class Printer3D extends PrinterImpl{
    private String materialOfPrint;

    public Printer3D(String model, int speedOfPrint, String material, String materialOfPrint) {
        super(model, speedOfPrint, material);
        this.materialOfPrint = materialOfPrint;
    }

    @Override
    public void print(String text) {
        System.out.println("Printer 3D is printing: \n" + text);
    }
}
