package oop.interfaces.computer;

public abstract class PrinterImpl implements IPrinter{
    private String model;
    private int speedOfPrint;
    private String material;

    public PrinterImpl(String model, int speedOfPrint, String material) {
        this.model = model;
        this.speedOfPrint = speedOfPrint;
        this.material = material;
    }

    public String toString(){
        return getClass() + "\nModel " + model + "\nSpeed of print " + speedOfPrint +
                "\nMaterial " + material;
    }
}
